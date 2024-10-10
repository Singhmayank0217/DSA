package Array;

public class SetMatrixzeroes {

    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i, m);
                    markCol(arr, j, n);
                }
            }
        }
        // Second pass to replace -1 with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    private void markRow(int[][] arr, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    private void markCol(int[][] arr, int j, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }
}

// another ffective technique to solve the question
/*
 * class Solution {
 * public void setZeroes(int[][] arr) {
 * int m = arr.length;
 * int n = arr[0].length;
 * boolean firstRowZero = false;
 * boolean firstColZero = false;
 * for (int j = 0; j < n; j++) {
 * if (arr[0][j] == 0) {
 * firstRowZero = true;
 * break;
 * }
 * }
 * for (int i = 0; i < m; i++) {
 * if (arr[i][0] == 0) {
 * firstColZero = true;
 * break;
 * }
 * }
 * for (int i = 1; i < m; i++) {
 * for (int j = 1; j < n; j++) {
 * if (arr[i][j] == 0) {
 * arr[i][0] = 0;
 * arr[0][j] = 0;
 * }
 * }
 * }
 * for (int i = 1; i < m; i++) {
 * if (arr[i][0] == 0) {
 * for (int j = 1; j < n; j++) {
 * arr[i][j] = 0;
 * }
 * }
 * }
 * for (int j = 1; j < n; j++) {
 * if (arr[0][j] == 0) {
 * for (int i = 1; i < m; i++) {
 * arr[i][j] = 0;
 * }
 * }
 * }
 * if (firstRowZero) {
 * for (int j = 0; j < n; j++) {
 * arr[0][j] = 0;
 * }
 * }
 * if (firstColZero) {
 * for (int i = 0; i < m; i++) {
 * arr[i][0] = 0;
 * }
 * }
 * }
 * }
 */
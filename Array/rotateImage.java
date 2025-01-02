package Array;

public class rotateImage {

    public void rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][n - 1 - i] = arr[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = result[i][j];
            }
        }
    }
}

// optimal solution :
/*
 * class Solution {
 * public void rotate(int[][] arr) {
 * int n = arr.length;
 * // Transpose the matrix
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * swap(arr, i, j, j, i);
 * }
 * }
 * // Reverse each row
 * for (int i = 0; i < n; i++) {
 * reverseRow(arr, i);
 * }
 * }
 * 
 * private void swap(int[][] arr, int i1, int j1, int i2, int j2) {
 * int temp = arr[i1][j1];
 * arr[i1][j1] = arr[i2][j2];
 * arr[i2][j2] = temp;
 * }
 * 
 * private void reverseRow(int[][] arr, int row) {
 * int n = arr.length;
 * for (int i = 0; i < n / 2; i++) {
 * swap(arr, row, i, row, n - 1 - i);
 * }
 * }
 * }
 */
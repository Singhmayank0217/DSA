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

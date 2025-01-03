package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;
        int left = 0;
        int dir = 0; // 0: right, 1: down, 2: left, 3: up

        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(arr[top][i]);
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    result.add(arr[i][right]);
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}

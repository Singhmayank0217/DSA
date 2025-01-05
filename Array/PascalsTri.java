package Array;

import java.util.*;

public class PascalsTri {

    private int nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            List<Integer> tempLst = new ArrayList<>();
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }
}

// Pascals Triangle another way
/*
 * import java.util.*;
 * 
 * class Solution {
 * public List<List<Integer>> generate(int numRows) {
 * List<List<Integer>> res = new ArrayList<>();
 * List<Integer> pre = null; // Declare and initialize pre
 * 
 * for (int i = 0; i < numRows; i++) {
 * List<Integer> row = new ArrayList<>();
 * for (int j = 0; j <= i; j++) {
 * if (j == 0 || j == i) {
 * row.add(1);
 * } else {
 * row.add(pre.get(j - 1) + pre.get(j));
 * }
 * }
 * res.add(row); // Add the completed row to the result
 * pre = row; // Update pre for the next iteration
 * }
 * return res;
 * }
 * }
 * 
 */

/*
 * Iteration 1 (i = 0):
 * A new row row is created: [].
 * Inner loop (j = 0):
 * j == 0 → Add 1 to row.
 * row = [1].
 * Add row to res: res = [[1]].
 * Update pre = [1].
 * 
 * 
 * Iteration 2 (i = 1):
 * A new row row is created: [].
 * Inner loop (j = 0 to 1):
 * j == 0 → Add 1 to row.
 * j == 1 → Add 1 to row (as j == i).
 * row = [1, 1].
 * Add row to res: res = [[1], [1, 1]].
 * Update pre = [1, 1].
 * 
 * 
 * Iteration 3 (i = 2):
 * A new row row is created: [].
 * Inner loop (j = 0 to 2):
 * j == 0 → Add 1 to row.
 * j == 1 → Add pre.get(0) + pre.get(1) = 1 + 1 = 2 to row.
 * j == 2 → Add 1 to row (as j == i).
 * row = [1, 2, 1].
 * Add row to res: res = [[1], [1, 1], [1, 2, 1]].
 * Update pre = [1, 2, 1].
 * 
 * 
 * Iteration 4 (i = 3):
 * A new row row is created: [].
 * Inner loop (j = 0 to 3):
 * j == 0 → Add 1 to row.
 * j == 1 → Add pre.get(0) + pre.get(1) = 1 + 2 = 3 to row.
 * j == 2 → Add pre.get(1) + pre.get(2) = 2 + 1 = 3 to row.
 * j == 3 → Add 1 to row (as j == i).
 * row = [1, 3, 3, 1].
 * Add row to res: res = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]].
 * Update pre = [1, 3, 3, 1].
 * 
 * 
 * Iteration 5 (i = 4):
 * A new row row is created: [].
 * Inner loop (j = 0 to 4):
 * j == 0 → Add 1 to row.
 * j == 1 → Add pre.get(0) + pre.get(1) = 1 + 3 = 4 to row.
 * j == 2 → Add pre.get(1) + pre.get(2) = 3 + 3 = 6 to row.
 * j == 3 → Add pre.get(2) + pre.get(3) = 3 + 1 = 4 to row.
 * j == 4 → Add 1 to row (as j == i).
 * row = [1, 4, 6, 4, 1].
 * Add row to res: res = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4,
 * 1]].
 * Update pre = [1, 4, 6, 4, 1].
 * Final Output:
 * res = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]].
 */
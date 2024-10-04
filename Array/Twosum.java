package Array;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}

// using map
/*
 * class Solution {
 * public int[] twoSum(int[] nums, int target) {
 * Map<Integer, Integer> sum = new HashMap<>();
 * int n = nums.length;
 * for (int i = 0; i < n; i++) {
 * int a = nums[i];
 * int more = target - a;
 * if (sum.containsKey(more)) {
 * return new int[] { sum.get(more), i };
 * }
 * sum.put(a, i);
 * }
 * return new int[0];
 * }
 * }
 */

package Array;

public class occuranceCount {
    class Solution {
        // using two for loop
        public int majorityElement(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        c++;
                    }
                }
                if (c > n / 2) {
                    return nums[i];
                }
            }
            return nums[0];
        }
    }
}

// using hashing
/*
 * class Solution {
 * public int majorityElement(int[] nums) {
 * Map<Integer, Integer> counts = new HashMap<>();
 * int n = nums.length;
 * 
 * for (int num : nums) {
 * counts.put(num, counts.getOrDefault(num, 0) + 1);
 * if (counts.get(num) > n / 2) {
 * return num;
 * }
 * }
 * return -1;
 * }
 * }
 */
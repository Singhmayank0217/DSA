public class MaxiAscSubArr {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int max = 0;
            int curMax = 0;
            int n = nums.length;
            int i = 0;
            while (i < n) {
                curMax += nums[i];
                if (i == n - 1 || nums[i] >= nums[i + 1]) {
                    max = Math.max(max, curMax);
                    curMax = 0;
                }
                i++;
            }
            return max;
        }
    }
}

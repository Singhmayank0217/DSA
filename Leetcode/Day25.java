public class Day25 {
    class Solution {
        public int maxAbsoluteSum(int[] nums) {
            int maxSum = 0;
            int minSum = 0;
            int currentMax = 0;
            int currentMin = 0;

            for (int num : nums) {
                currentMax += num;
                maxSum = Math.max(maxSum, currentMax);
                if (currentMax < 0) {
                    currentMax = 0;
                }
                currentMin += num;
                minSum = Math.min(minSum, currentMin);
                if (currentMin > 0) {
                    currentMin = 0;
                }
            }
            return Math.max(maxSum, Math.abs(minSum));
        }
    }

}

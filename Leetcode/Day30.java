public class Day30 {
    class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> equal = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();
            int index = 0;
            for (int num : nums) {
                if (num < pivot) {
                    less.add(num);
                } else if (num == pivot) {
                    equal.add(num);
                } else {
                    greater.add(num);
                }
            }
            for (int num : less) {
                nums[index++] = num;
            }
            for (int num : equal) {
                nums[index++] = num;
            }
            for (int num : greater) {
                nums[index++] = num;
            }
            return nums;
        }
    }
}

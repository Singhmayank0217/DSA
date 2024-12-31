import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    for (int d = c + 1; d < n; d++) {
                        if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
                            List<Integer> quadruplet = new ArrayList<>();
                            quadruplet.add(nums[a]);
                            quadruplet.add(nums[b]);
                            quadruplet.add(nums[c]);
                            quadruplet.add(nums[d]);
                            result.add(quadruplet);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}

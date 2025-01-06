package Array;

import java.util.ArrayList;
import java.util.List;

//Brute Force approach
public class MajorityEle2 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            if (c > n / 3 && !res.contains(nums[i])) {
                res.add(nums[i]);
            }
            if (res.size() == 2) {
                break;
            }
        }
        return res;
    }
}

// Better solution

/*
 * class Solution {
 * public List<Integer> majorityElement(int[] nums) {
 * Map<Integer, Integer> counts = new HashMap<>();
 * int n = nums.length;
 * for (int num : nums) {
 * counts.put(num, counts.getOrDefault(num, 0) + 1);
 * }
 * List<Integer> result = new ArrayList<>();
 * for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
 * if (entry.getValue() > n / 3) {
 * result.add(entry.getKey());
 * }
 * }
 * return result;
 * }
 * }
 */

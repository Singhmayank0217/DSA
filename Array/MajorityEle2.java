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

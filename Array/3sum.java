import java.util.*;
public class 3sum {

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> uniqueTriplets = new HashSet<>(); // Set to store unique triplets

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (uniqueTriplets.add(triplet)) { 
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }
}

}


/* using two for loop 

 import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> numCount = new HashMap<>(); //Store number counts
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        //Count the occurrences of each number
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -(nums[i] + nums[j]);
                if (numCount.containsKey(complement)) {
                    //Handle cases where complement is one of i or j
                    if (complement == nums[i] && numCount.get(complement) > 1 ||
                        complement == nums[j] && numCount.get(complement) > 1 ||
                        complement != nums[i] && complement != nums[j]) {

                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet); //Sort for consistent order in HashSet
                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(uniqueTriplets);
    }
}

 
 */
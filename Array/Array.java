package Array;

import java.util.*;

class Array {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Array solution = new Array();
        int[] nums1 = { 1, 1, 2 };
        int len1 = solution.removeDuplicates(nums1);
        System.out.println("Length of array after removing duplicates: " + len1);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int len2 = solution.removeDuplicates(nums2);
        System.out.println("Length of array after removing duplicates: " + len2);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {};
        int len3 = solution.removeDuplicates(nums3);
        System.out.println("Length of array after removing duplicates: " + len3);
        System.out.println("Array after removing duplicates: " + Arrays.toString(nums3));

    }
}

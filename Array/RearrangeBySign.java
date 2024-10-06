package Array;

public class RearrangeBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
}

// 2149. Rearrange Array Elements by Sign

// when positive and negative number is not same the

/*
 * class Solution {
 * public int[] rearrangeArray(int[] nums) {
 * int n = nums.length;
 * int[] result = new int[n];
 * int posIndex = 0;
 * int negIndex = 1;
 * int posCount = 0;
 * int negCount = 0;
 * 
 * // Count positive and negative numbers
 * for (int num : nums) {
 * if (num >= 0) {
 * posCount++;
 * } else {
 * negCount++;
 * }
 * }
 * 
 * for (int i = 0; i < n; i++) {
 * if (nums[i] >= 0 && posIndex < n && posCount > 0) {
 * result[posIndex] = nums[i];
 * posIndex += 2;
 * posCount--;
 * } else if (nums[i] < 0 && negIndex < n && negCount > 0) {
 * result[negIndex] = nums[i];
 * negIndex += 2;
 * negCount--;
 * }
 * }
 * 
 * //Append remaining positive numbers
 * int k = 0;
 * while (posIndex < n && k < nums.length) {
 * if (nums[k] >= 0) {
 * result[posIndex] = nums[k];
 * posIndex++;
 * k++;
 * } else {
 * k++;
 * }
 * }
 * k = 0;
 * 
 * //Append remaining negative numbers
 * while (negIndex < n && k < nums.length) {
 * if (nums[k] < 0) {
 * result[negIndex] = nums[k];
 * negIndex++;
 * k++;
 * } else {
 * k++;
 * }
 * }
 * 
 * return result;
 * }
 * }
 * 
 */
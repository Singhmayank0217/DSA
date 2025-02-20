package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Day18 {
    class Solution {
        public String getHappyString(int n, int k) {
            List<String> result = new ArrayList<>();
            backtrack("", n, result, k);
            return k <= result.size() ? result.get(k - 1) : "";
        }

        private void backtrack(String current, int n, List<String> result, int k) {
            if (current.length() == n) {
                result.add(current);
                return;
            }
            for (char c : new char[] { 'a', 'b', 'c' }) {
                if (current.isEmpty() || current.charAt(current.length() - 1) != c) {
                    backtrack(current + c, n, result, k);
                    if (result.size() == k)
                        return;
                }
            }
        }
    }

}

public class MaxDepthParan {
    class Solution {
        public int maxDepth(String s) {
            int depth = 0;
            int maxDep = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    depth++;
                    maxDep = Math.max(maxDep, depth);
                }
                if (s.charAt(i) == ')')
                    depth--;
            }
            return maxDep;
        }
    }
}

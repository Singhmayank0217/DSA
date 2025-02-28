public class Day27 {
    class Solution {
        public String shortestCommonSupersequence(String str1, String str2) {
            String lcs = findLCS(str1, str2);
            StringBuilder result = new StringBuilder();
            int i = 0, j = 0;
            for (char c : lcs.toCharArray()) {

                while (i < str1.length() && str1.charAt(i) != c) {
                    result.append(str1.charAt(i++));
                }
                while (j < str2.length() && str2.charAt(j) != c) {
                    result.append(str2.charAt(j++));
                }
                result.append(c);
                i++;
                j++;
            }
            while (i < str1.length()) {
                result.append(str1.charAt(i++));
            }
            while (j < str2.length()) {
                result.append(str2.charAt(j++));
            }
            return result.toString();
        }

        private String findLCS(String str1, String str2) {
            StringBuilder lcs = new StringBuilder();
            int[][] dp = new int[str1.length() + 1][str2.length() + 1];
            for (int i = 1; i <= str1.length(); i++) {
                for (int j = 1; j <= str2.length(); j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            int i = str1.length(), j = str2.length();
            while (i > 0 && j > 0) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs.insert(0, str1.charAt(i - 1));
                    i--;
                    j--;
                } else if (dp[i - 1][j] > dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
            return lcs.toString();
        }
    }

}

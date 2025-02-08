public class LongestPallin {
    class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();
            String longestPalindrome = "";
            for (int i = 0; i < n; i++) {
                StringBuilder front = new StringBuilder();
                StringBuilder rev = new StringBuilder();
                for (int j = i; j < n; j++) {
                    front.append(s.charAt(j));
                    rev.insert(0, s.charAt(j));
                    if (front.toString().equals(rev.toString())) {
                        if (front.length() > longestPalindrome.length()) {
                            longestPalindrome = front.toString();
                        }
                    }
                }
            }
            return longestPalindrome;
        }
    }

}

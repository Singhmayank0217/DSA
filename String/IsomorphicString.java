package String;

import java.util.HashMap;

public class IsomorphicString {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length())
                return false;
            HashMap<Character, Character> chk = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);
                if (chk.containsKey(ch1)) {
                    if (!chk.get(ch1).equals(ch2))
                        return false;
                } else {
                    if (chk.containsValue(ch2))
                        return false;

                    chk.put(ch1, ch2);
                }
            }
            return true;
        }
    }

}

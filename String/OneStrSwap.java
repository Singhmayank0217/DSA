package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneStrSwap {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2))
                return true;
            Map<Character, Character> mismatchMap = new HashMap<>();
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    mismatchMap.put(s1.charAt(i), s2.charAt(i));
                    count++;
                }
            }
            if (count == 0)
                return true;
            if (count == 2 && mismatchMap.size() == 2) {
                List<Character> keys = new ArrayList<>(mismatchMap.keySet());
                List<Character> values = new ArrayList<>(mismatchMap.values());
                return keys.get(0).equals(values.get(1)) && keys.get(1).equals(values.get(0));
            }
            return false;
        }
    }
}

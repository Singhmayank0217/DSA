import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFre {
    class Solution {
        public String frequencySort(String s) {
            if (s == null || s.isEmpty())
                return s;
            Map<Character, Integer> countMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(countMap.entrySet());
            Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : list) {
                char c = entry.getKey();
                int count = entry.getValue();
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }
}

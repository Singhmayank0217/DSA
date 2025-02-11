//using HashMap
public class SumOfBeauty {
    class Solution {
        public int beautySum(String s) {
            int totalBeauty = 0;
            int n = s.length();
            for (int i = 0; i < n; i++) {
                HashMap<Character, Integer> freqMap = new HashMap<>();
                int maxFreq = 0;
                for (int j = i; j < n; j++) {
                    char ch = s.charAt(j);
                    freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                    maxFreq = Math.max(maxFreq, freqMap.get(ch));
                    int minFreq = Integer.MAX_VALUE;
                    for (int freq : freqMap.values()) {
                        if (freq > 0) {
                            minFreq = Math.min(minFreq, freq);
                        }
                    }
                    totalBeauty += (maxFreq - minFreq);
                }
            }
            return totalBeauty;
        }
    }
}

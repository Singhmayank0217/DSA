class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        int total = 0;
        int rem = 0;
        for (int i = 0; i < s.length(); i++) {
            int curVal = romanToIntMap.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? romanToIntMap.get(s.charAt(i + 1)) : 0;
            if (nextVal > curVal) {
                rem = nextVal - curVal;
                total += rem;
                i++;
            } else {
                total += curVal;
            }
        }
        return total;
    }
}

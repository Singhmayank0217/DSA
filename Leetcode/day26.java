import java.util.HashSet;

//using hashset 
public class day26 {
    class Solution {
        public int lenLongestFibSubseq(int[] arr) {
            int n = arr.length;
            int maxLen = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int x = arr[i];
                    int y = arr[j];
                    int length = 2;
                    while (set.contains(x + y)) {
                        int z = x + y;
                        x = y;
                        y = z;
                        length++;
                    }
                    maxLen = Math.max(maxLen, length);
                }
            }
            return maxLen >= 3 ? maxLen : 0;
        }
    }

}

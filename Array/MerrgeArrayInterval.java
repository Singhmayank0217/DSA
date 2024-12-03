import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MerrgeArrayInterval {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.get(res.size() - 1);
            int[] current = intervals[i];

            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                res.add(current);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}

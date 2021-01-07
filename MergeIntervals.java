package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);

        for (int[] interval : intervals) {
            if (ans.size() == 0 || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}

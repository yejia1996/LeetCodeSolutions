package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CanAttendMeetings {
    public boolean canAttendMeetings(int[][] intervals) {
//        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));

        for (int i = 0; i < intervals.length-1; i++) {
            if (intervals[i][1] > intervals[i+1][0]) {
                return false;
            }
        }
        return true;
    }
}


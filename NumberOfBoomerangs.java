package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class NumberOfBoomerangs {
    private int distance(int[] point1, int[] point2) {
        return ((point1[0]-point2[0])*(point1[0]-point2[0]) +
                (point1[1]-point2[1])*(point1[1]-point2[1]));
    }

    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int totalCount = 0, count;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (j==i) { continue; }
                int d = distance(points[i],points[j]);
                map.put(d,map.getOrDefault(d,0)+1);
            }
            count = 0;
            for (Integer j : map.keySet()) {
                count += map.get(j)*(map.get(j)-1);
            }
            map.clear();
            totalCount += count;
        }
        return totalCount;
    }
}

package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        int[] ans = new int[set1.size()];
        int count = 0;
        for (int i: set1) {
            if (set2.contains(i)) {
                ans[count++] = i;
            }
        }
        return Arrays.copyOf(ans, count);
    }
}

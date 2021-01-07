package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> map  = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int count = map.getOrDefault(nums1[i],0)+1;
            map.put(nums1[i],count);
        }

        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                intersection[index++] = nums2[i];
                if (map.get(nums2[i])-1 <= 0) {
                    map.remove(nums2[i]);
                } else {
                    map.put(nums2[i],map.get(nums2[i])-1);
                }
            }
        }
        return Arrays.copyOf(intersection,index);

    }
}

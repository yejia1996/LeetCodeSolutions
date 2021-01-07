package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThreeNumber {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums == null || nums.length <= 2) { return answer; };
        Arrays.sort(nums);

        for (int first = 0; first < nums.length; first++) {
            // 第一次枚举first的数，已能够返回所有可能结果
            if (first > 0 && nums[first]==nums[first-1]) { continue; }
            if (nums[first]>0) { break; }

            int third = nums.length-1;
            for (int second = first+1; second < third; second++) {
                // 第一次枚举second的数，已能够返回所有可能结果
                if (second > first+1 && nums[second]==nums[second-1]) { continue; }
                while (second<third && nums[first]+nums[second]+nums[third]>0 ) {
                    third -= 1;
                }
                if (second>=third) { break; }

                if (nums[first]+nums[second]+nums[third]==0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    answer.add(list);
                }
            }
        }
        return answer;
    }
}

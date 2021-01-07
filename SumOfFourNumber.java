package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfFourNumber {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums.length < 4) { return answer; };
        Arrays.sort(nums);

        for (int first = 0; first <= nums.length-4; first++) {
            if (first > 0 && nums[first]==nums[first-1]) { continue; }
            for (int second = first+1; second<=nums.length-3; second++) {
                if (second > first+1 && nums[second]==nums[second-1]) { continue; }
                int third = second+1, fourth = nums.length-1;
                while (third<fourth) {
                    if (nums[first]+nums[second]+nums[third]+nums[fourth]==target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]); list.add(nums[second]); list.add(nums[third]); list.add(nums[fourth]);
                        answer.add(list);
                        third += 1;
                        fourth -= 1;
                        // 只有当四个数成功以后再更新third和fourth时，才需要避免重复值
                        // 此if代码块以外，四个数不成功，只需要third++或fourth--，无需避免重复值
                        while (third<fourth && nums[third]==nums[third-1]) { third += 1; }
                        while (fourth>third && nums[fourth]==nums[fourth+1]) { fourth -= 1; }
                    }
                    else if (nums[first]+nums[second]+nums[third]+nums[fourth]<target) {
                        third += 1;
                    }
                    else if (nums[first]+nums[second]+nums[third]+nums[fourth]>target) {
                        fourth -= 1;
                    }
                }
            }
        }
        return answer;
    }
}
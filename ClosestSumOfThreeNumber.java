package LeetCode;

import java.util.Arrays;

public class ClosestSumOfThreeNumber {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (Math.abs(result - target) >
                        Math.abs(nums[i] + nums[left] + nums[right] - target)) {
                    result = nums[i] + nums[left] + nums[right];
                }
                if (nums[i] + nums[left] + nums[right] == target) {
                    return nums[i] + nums[left] + nums[right];
                } else if (nums[i] + nums[left] + nums[right] > target) {
                    right -= 1;
                } else {
                    left += 1;
                }
            }
        }
        return result;
    }
}

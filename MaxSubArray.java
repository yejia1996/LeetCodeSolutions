package LeetCode;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int result = nums[0],sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            result = result>sum ? result : sum;
            if (sum<0) { sum=0; }
        }
        return result;
    }
}

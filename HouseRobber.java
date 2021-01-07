package LeetCode;

public class HouseRobber {
    public int rob(int[] nums) {
        int current = 0, prevTwo = 0, prevOne = 0;
        for (int i = 0; i < nums.length; i++) {
            // DP[i] = max( DP[i-1], DP[i-2]+nums[i] );
            // 循环开始时，prevOne 表示 DP[i-1]，prevTwo 表示 DP[i-2]
            current = Math.max(prevOne,prevTwo+nums[i]);
            prevTwo = prevOne;
            prevOne = current;
            // 循环结束时，prevOne和current都表示DP[i]
        }
        return current;
    }
}

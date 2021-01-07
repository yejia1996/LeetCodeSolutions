package LeetCode;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int mostRight = 0;
        for (int i = 0; i < nums.length; i++) {
            // 先判断之前的mostRight能否到达位置i
            if (mostRight < i) {
                return false;
            }
            // 再更新mostRight
            mostRight = Math.max(mostRight, i+nums[i]);
        }
        return true;
    }
}

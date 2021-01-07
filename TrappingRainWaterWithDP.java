package LeetCode;

public class TrappingRainWaterWithDP {
    public int trap(int[] height) {
        int ans = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        // maxLeft maxRight 不包括自身height[i]
        for (int i = 1; i < maxLeft.length-1; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }
        for (int i = maxRight.length-2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
        }
        for (int i = 1; i < height.length-1; i++) {
            if (Math.min(maxLeft[i], maxRight[i]) > height[i]) {
                ans += Math.min(maxLeft[i], maxRight[i])-height[i];
            }
        }
        return ans;
    }
}

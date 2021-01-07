package LeetCode;

public class TrappingRainWaterWithTwoPointer {
    public int trap(int[] height) {
        int ans = 0;
        int leftPointer = 0, rightPointer = height.length-1;
        int maxLeft = 0, maxRight = 0;
        /*
          1. 当我们从左往右处理到leftPointer下标时，
          左边最大值maxLeft是可信的，
          右边最大值maxRight是不可信的。
          2. 从右往左刚好相反
          3. 位置i处存的水，取决于min{maxLeft， maxRight}
         */
        while (leftPointer<rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                maxLeft = Math.max(maxLeft, height[leftPointer]);
                if (maxLeft > height[leftPointer]) {
                    ans += maxLeft-height[leftPointer];
                }
                leftPointer++;
            } else {
                maxRight = Math.max(maxRight, height[rightPointer]);
                if (maxRight > height[rightPointer]) {
                    ans += maxRight-height[rightPointer];
                }
                rightPointer--;
            }
        }
        return ans;
    }
}

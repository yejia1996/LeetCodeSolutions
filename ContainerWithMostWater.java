package LeetCode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int base, high, ans = 0;
        int leftPointer = 0, rightPointer = height.length-1;
        while (leftPointer<rightPointer) {
            base = rightPointer-leftPointer;
            high = Math.min(height[leftPointer],height[rightPointer]);
            ans = Math.max(base*high,ans);

            if (height[leftPointer]<height[rightPointer]) {
                leftPointer += 1;
            } else {
                rightPointer -= 1;
            }
        }
        return ans;
    }
}

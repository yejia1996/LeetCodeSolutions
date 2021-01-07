package LeetCode;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        if (nums.length==0) { return ans; }
        int left = 0, right = nums.length-1;
        // 寻找左边界
        while (left < right) {
            int mid = left + (right-left)/2;
            if (nums[mid]>=target) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        // while 终止条件： left==right
        if (nums[left]!=target) {
            return ans;
        }
        ans[0] = left;

        // 寻找右边界
        // 先恢复right指针
        right = nums.length-1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (nums[mid]<=target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        // while 终止条件： left==right
        if (nums[right]!=target) {
            ans[1] = left-1;
            return ans;
        }
        ans[1] = right;
        return ans;
    }
}

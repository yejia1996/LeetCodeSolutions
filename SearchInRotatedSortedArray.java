package LeetCode;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len==0) { return -1; }
        if (len==1) { return nums[0]==target ? 0 : -1; }
        int left = 0, right = len-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if (nums[mid]==target) { return mid; }
            // 左侧有序，严格升序
            if (nums[0]<=nums[mid]) {
                if (nums[mid]>target && nums[0]<=target) {
                    right = mid-1;
                }
                // 不能用else if
                // 不满足(nums[mid]>target && nums[0]<=target)的情况，left都要变成mid+1
                else {
                    left = mid+1;
                }
            }
            // 右侧有序，严格升序
            if (nums[0]>nums[mid]) {
                // 用len-1 不能用 right
                if (nums[mid]<target && nums[len-1]>=target) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}

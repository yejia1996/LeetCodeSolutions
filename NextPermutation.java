package LeetCode;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int cur = nums.length-1;
        while (cur>=1 && nums[cur]<=nums[cur-1]) {
            cur--;
        }
        // nums[cur] > nums[cur-1]
        // 需要 cur-1
        if (cur>=1) {
            int next = nums.length-1;
            while (next>=1 && nums[next]<=nums[cur-1]) {
                next--;
            }
            // nums[next] > nums[cur-1]
            // 需要 next
            swap(nums, cur-1, next);
        }
        reverse(nums, cur, nums.length-1);
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        for (int i = nums.length-1; i > start; i--) {
            swap(nums, start, i);
            start++;
        }
    }
}

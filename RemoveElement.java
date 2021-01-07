package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,5};
        int val = 2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < (nums.length); i++) {
            System.out.println(nums[i]);
        }
    }
}
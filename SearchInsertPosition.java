package LeetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 5, 6};
        int target = 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                System.out.println(i-1);
                break;
            }
        }
    }
}

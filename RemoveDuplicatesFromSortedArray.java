package LeetCode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,5};
        int i = 0;
        for (int j = i+1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}

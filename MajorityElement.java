package LeetCode;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==temp) {
                count++;
            } else {
                count--;
            }
            if (count==0) {
                temp = nums[i];
            }
        }
        return temp;
    }
}

package LeetCode;

public class TwoSumWithSortedArray {
    // 双指针暴力求解 时间复杂度O(n^2)
//    public int[] twoSum(int[] numbers, int target) {
//        int[] ans = new int[2];
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[j]==target-numbers[i]) {
//                    ans[0] = i+1;
//                    ans[1] = j+1;
//                    return ans;
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    public int[] twoSum(int[] numbers, int target) {
        // 升序排列的有序数组，原地遍历 时间复杂度O(n)
        int left = 0, right = numbers.length-1;
        while (left<right) {
            if (numbers[left]+numbers[right]==target) {
                return new int[]{left+1,right+1};
            } else if (numbers[left]+numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}

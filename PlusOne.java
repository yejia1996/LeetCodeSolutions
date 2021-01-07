package LeetCode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i] += 1;
            digits[i] = digits[i]%10;
            if (digits[i]%10!=0) {
                return digits;
            }
        }
        // 程序如果仍然未返回digits, 说明从原数组全为9
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits = {1,2,9};
        int[] result = po.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

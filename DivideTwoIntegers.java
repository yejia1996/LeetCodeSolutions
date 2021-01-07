package LeetCode;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // [−2^31,  2^31 − 1]
        boolean isPositive = true;
        if ((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) {
            isPositive = false;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            return -dividend;
        }
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int ans = divHelper(dividend, divisor);
        return isPositive ? ans : -ans;
    }

    private int divHelper(int dividend, int divisor) {
        if (dividend > divisor) {
            return 0;
        }
        int count = 1;
        int temp = divisor;
        // temp+temp溢出int后不再小于0
        while (dividend <= temp+temp && temp+temp < 0) {
            temp += temp;
            count += count;
        }
        return count+divHelper(dividend-temp, divisor);
    }
}

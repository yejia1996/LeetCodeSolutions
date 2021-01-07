package LeetCode;

public class HappyNumber {
    public int getNext(int n) {
        int temp = 0;
        while (n>0) {
            temp = temp+(n%10)*(n%10);
            n = n/10;
        }
        return temp;
    }

    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner!=1 && slowRunner!=fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner==1;
    }
}

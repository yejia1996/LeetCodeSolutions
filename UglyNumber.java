package LeetCode;

public class UglyNumber {
    public boolean isUgly(int num) {
        if (num==0) {return false;}
        int[] flag = new int[]{2,3,5};
        for (int i = 0; i < flag.length; i++) {
            while (num%flag[i]==0) {
                num = num/flag[i];
            }
        }
        return num == 1;
    }
}

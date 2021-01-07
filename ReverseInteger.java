package LeetCode;

public class ReverseInteger {
    public int reverse(int x) {
//        int result = 0;
//        while (x!=0) {
//            int newResult = result*10+ x%10;
//            if ((newResult-x%10)/10!=result) {
//                return 0;
//            }
//            result = newResult;
//            x = x/10;
//        }
//        return result;


        int result = 0;
        while (x != 0) {
            // 2^31-1=2147483647,-2^31=-2147483648
            // 若溢出，result必然>=214748364.7
            if ( (result>214748364) || (result==214748364 && x%10>7) ) {
                return 0;
            }
            if ( (result<-214748364) || (result==-214748364 && x%10<-8) ) {
                return 0;
            }
            result = result*10 + x%10;
            x /= 10;
        }
        return result;
    }
}

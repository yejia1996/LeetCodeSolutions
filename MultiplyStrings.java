package LeetCode;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) { return "0"; }
        String ans = "0";
        String shortNum = num1.length() <= num2.length() ? num1 : num2;
        String longNum = num1.length() <= num2.length() ? num2 : num1;
        int lenShort = shortNum.length(), lenLong = longNum.length();
        for (int i = lenShort-1; i >=0; i--) {
            StringBuffer cur = new StringBuffer();
            int add = 0;
            // 小数的此位在哪一位，将对应个数的零补到最后结果上
            for (int j = lenShort-1; j > i; j--) {
                cur.append(add);
            }
            // 小数的此位上的实际数字，与大数做乘法
            int y = shortNum.charAt(i)-'0';
            for (int j = longNum.length()-1; j >= 0; j--) {
                int x = longNum.charAt(j)-'0';
                int product = x*y+add;
                add = product/10;
                cur.append(product%10);
            }
            if (add!=0) {
                cur.append(add%10);
            }
            // 小数的此位计算完，取反后为实际值，累加
            ans = addStrings(ans,cur.reverse().toString());
        }
        return ans;
    }

    public String addStrings(String num1, String num2) {
        StringBuffer ans = new StringBuffer();
        int i = num1.length()-1, j = num2.length()-1;
        int carrier = 0;
        while (i>=0 || j>=0) {
            int n1 = i>=0 ? num1.charAt(i)-'0' : 0;
            int n2 = j>=0 ? num2.charAt(j)-'0' : 0;
            int temp = n1+n2+carrier;
            carrier = temp/10;
            ans.append(temp%10);
            i--;
            j--;
        }
        if (carrier==1) {
            ans.append(1);
        }
        return ans.reverse().toString();
    }
}

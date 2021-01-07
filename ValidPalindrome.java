package LeetCode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // 正则表达式替换非字母和数字字符
        s = s.replaceAll("[^0-9a-z]","");
        StringBuffer sNew = new StringBuffer(s).reverse();
        return s.toString().equals(sNew.toString());
    }
}

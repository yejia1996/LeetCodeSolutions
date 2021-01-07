package LeetCode;

public class ImplementIndexOf {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        if (needle.length() == 0) {
            System.out.println(0);
        }
        int m = needle.length(), n = haystack.length();
        String temp;
        for (int i = 0; i <= n - m; ++i) {
            temp = haystack.substring(i, i + m);
            if (temp.equals(needle)) {
                System.out.println(i);
            }
        }
    }
}
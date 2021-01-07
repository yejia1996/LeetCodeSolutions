package LeetCode;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // 排序
//        if (s.length() != t.length()) { return false; }
//        char[] str1 = s.toCharArray(), str2 = t.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        return Arrays.equals(str1,str2);

        // 哈希表
        if (s.length() != t.length()) { return false; }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)-'a'] += 1;
            counter[t.charAt(i)-'a'] -= 1;
        }
        for (int j : counter) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}

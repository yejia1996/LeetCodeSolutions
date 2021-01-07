package LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int count = 0;
            for (int j = 0; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) == strs[i].charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            ans = ans.substring(0,count);
        }
        return ans;
    }
}
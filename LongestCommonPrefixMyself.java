package LeetCode;

public class LongestCommonPrefixMyself {
    public String longestCommonPrefix(String[] strs) {
        int len1 = strs[0].length();
        int len2 = strs[1].length();
        int len3 = strs[2].length();
        int maxLen = len1>len2 ? len1 : len2;
        maxLen = maxLen>len3 ? maxLen : len3;
        String count = "";
        for (int i = 0; i < maxLen-1; i++) {
            String s1 = strs[0].substring(i,i+1);
            String s2 = strs[1].substring(i,i+1);
            String s3 = strs[2].substring(i,i+1);
            if (s1.equals(s2) && s2.equals(s3)) {
                count = count + s1;
            }
            else {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LongestCommonPrefixMyself lcp = new LongestCommonPrefixMyself();
        String[] strs = {"flower","flow","flight"};
        System.out.println(lcp.longestCommonPrefix(strs));
    }
}

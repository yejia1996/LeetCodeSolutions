package LeetCode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) { return s; }

        // DP[i][j] 表示 s[i, j] 是否是回文串
        // DP[i][j] = (s[i]==s[j]) && DP[i+1][j-1]
        // 先得到小子串的回文判定，大子串参考小子串的判断结果
        // 因为有DP[i+1][j-1]，需要考虑边界情况
        // [i+1, j-1]必须为一个区间
        // j-1-(i+1)+1>=2
        // j-i>=3
        boolean[][] DP = new boolean[len][len];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < len; i++) {
            DP[i][i] = true;
        }

        int maxLen = 1;
        int begin = 0;
        for (int right = 1; right < len; right++) {
            for (int left = 0; left < right; left++) {
                if (charArray[left] != charArray[right]) {
                    DP[left][right] = false;
                } else {
                    // charArray[left] == charArray[right]
                    if (right-left < 3) {
                        DP[left][right] = true;
                    } else {
                        // length=right-left+1 >= 4
                        DP[left][right] = DP[left+1][right-1];
                    }
                }
                // dp[i][j]==true，记录起始位置和长度
                if (DP[left][right] && right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    begin = left;
                }
            }
        }
        return s.substring(begin, begin+maxLen);
    }

    class solution2{
        private String centerSpread(String s, int left, int right) {
            int i = left, j = right;
            while (i>=0 && j<s.length()) {
                if (s.charAt(i)==s.charAt(j)) {
                    i -= 1;
                    j += 1;
                } else {
                    break;
                }
            }
            return s.substring(i+1,j);
        }
        public String longestPalindrome(String s) {
            int len = s.length();
            if (len < 2) { return s; }
            int maxLen = 1;
            String ans = s.substring(0,1);
            for (int i = 0; i < len; i++) {
                String strOdd = centerSpread(s,i,i);
                String strEven = centerSpread(s,i,i+1);
                String longestStr = strOdd.length()>strEven.length() ? strOdd : strEven;
                if (longestStr.length() > maxLen) {
                    ans = longestStr;
                    maxLen = ans.length();
                }
            }
            return ans;
        }
    }
}

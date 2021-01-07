package LeetCode;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // ASCII 在英语中，用128个符号编码便可以表示所有
        // needElement：记录target字符串中的各元素还需要几个。该元素位置上的数为0代表不需要了。
        int[] needElement = new int[128];
        for (int i = 0; i < t.length(); i++) {
            needElement[t.charAt(i)]++;
        }

        int left = 0, right = 0;
        // countTarget：记录target中还剩多少个字符未被满足
        int countTarget = t.length();
        // 最终答案的开始位置和长度
        int startIndex = 0, lengthOfAnswer = s.length();
        // 开始滑动
        while (right < s.length()) {
            // 右边界的字符仍被需要：所需总字符数-1
            if (needElement[s.charAt(right)] > 0) {
                countTarget--;
            }
            // 此时，右边界已经进入窗口，右边界字符所需个数-1
            needElement[s.charAt(right)]--;
            // 当前窗口刚好满足target
            if (countTarget == 0) {
                // 开始更新现有窗口
                // 左边界字符已超出需要：needElement<0
                while (needElement[s.charAt(left)] < 0) {
                    // 移除左边界的字符，左边界右移一格
                    needElement[s.charAt(left)]++;
                    left++;
                }
                // 此时，左边界字符恰好满足需要。记录并更新最小覆盖子串的起始位置和长度
                if (right-left+1 < lengthOfAnswer) {
                    startIndex = left;
                    lengthOfAnswer = right-left+1;
                }
                // 左边界再右移一格，使得当前窗口不符合要求。实现窗口更新。
                needElement[s.charAt(left)]++;
                left++;
                countTarget++;
            }
            right++;
        }
        return lengthOfAnswer == s.length() ? "" : s.substring(startIndex, startIndex+lengthOfAnswer);
    }
}

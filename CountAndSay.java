package LeetCode;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder();
        int leftIndex = 0;
        int rightIndex = 1;
        if (n==1) {
            return "1";
        }
        String str = countAndSay(n-1);
        for (; rightIndex < str.length(); rightIndex++) {
            // 当前字符与前面紧邻的字符不等,则更新结果
            if (str.charAt(rightIndex) != str.charAt(leftIndex)) {
                int count = rightIndex-leftIndex;
                ans.append(count).append(str.charAt(leftIndex));
                leftIndex = rightIndex;
            }
        }
        ans.append(rightIndex-leftIndex).append(str.charAt(leftIndex));
        return ans.toString();
    }
}

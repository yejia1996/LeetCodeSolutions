package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    static final Map<Character, String> map = Map.of(
            '2', "abc", '3', "def",
            '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs",
            '8', "tuv", '9', "wxyz");

    List<String> result = new ArrayList<>();

    // num: 仅包含数字2-9的字符串
    // letters:
    // index: num的各位索引
    public void iterateString(String num, String letters, int index) {
        if (index== num.length()) {
            result.add(letters);
            return;
        }
        String letterList = map.get(num.charAt(index));
        for (int i = 0; i < letterList.length(); i++) {
            iterateString(num, letters + letterList.charAt(i), index+1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        iterateString(digits,"",0);
        return result;
    }
}

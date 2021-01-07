package LeetCode;
/**
 * @author 径流系数
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        int n = s.length();
        if (n%2 == 1) { return false; }

        Map<Character,Character> map = Map.of(')','(',']','[','}','{');
        LinkedList<Character> stack = new LinkedList<>();
        // map的key为右括号，value为左括号
        // stack存左括号
        // 遇到左括号，入栈
        // 遇到右括号，取出栈顶的左括号，判断是否正确闭合
        for (int i = 0; i < n; i++) {
            char temp = s.charAt(i);
            if (!map.containsKey(temp)) {
                stack.push(temp);
            } else {
                if (stack.isEmpty() || !map.get(temp).equals(stack.peek())) {
                    return false;
                }
                stack.removeFirst();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("(){}[]"));
    }
}

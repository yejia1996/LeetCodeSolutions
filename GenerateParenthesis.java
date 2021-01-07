package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 径流系数
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n==0) { return ans; }
        depthFirstSearch("",0,0, n, ans);
        return ans;
    }

    /**
     *
     * @param curStr 当前答案
     * @param left 左括号累计数量
     * @param right 右括号累计数量
     * @param n  括号总量的限制
     * @param ans 最终答案
     */
    public void depthFirstSearch(String curStr, int left, int right, int n, List<String> ans) {
        // 保证 n >= left >= right
        if (left==n && right==n) {
            ans.add(curStr);
        }
        // 剪枝
        if (left<right) {
            return;
        }
        if (left<n) {
            depthFirstSearch(curStr+"(",left+1,right, n, ans);
        }
        if (right<n) {
            depthFirstSearch(curStr+")",left, right+1, n, ans);
        }
    }
}

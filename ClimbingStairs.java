package LeetCode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int p, q = 0, ans = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = ans;
            ans = p + q;
        }
        return ans;
    }
}

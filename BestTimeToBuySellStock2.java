package LeetCode;
// 贪心算法 每日的最优解必为全局最优解
public class BestTimeToBuySellStock2 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1]>prices[i]) {
                ans = ans+prices[i+1]-prices[i];
            }
        }
        return ans;
    }
}

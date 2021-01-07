package LeetCode;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                sum = Math.max(sum, prices[j]-prices[i]);
            }
        }
        return sum;
    }
}

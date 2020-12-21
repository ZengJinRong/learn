package com.company.solution;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int ans = 0;
        int low = prices[0];
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                ans += prices[i] - low;
                low = prices[i + 1];
            }
        }
        ans += prices[prices.length - 1] - low;
        return ans;
    }

    public int maxProfit2(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
}

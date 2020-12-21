package com.company.solution;

/**
 * 121. 买卖股票的最佳时机
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int ans = 0;
        for (int price : prices) {
            if (price > low) {
                ans = Math.max(ans, price - low);
            } else {
                low = price;
            }
        }
        return ans;
    }
}

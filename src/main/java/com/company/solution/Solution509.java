package com.company.solution;

/**
 * 509. 斐波那契数
 */
public class Solution509 {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }

        int[] dp = new int[N + 1];
//        dp[0] = 0; //数组元素默认值就为0
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    // TODO: 2020/2/4 其他解法
}

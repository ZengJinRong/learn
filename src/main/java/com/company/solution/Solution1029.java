package com.company.solution;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1029. 两地调度
 */
public class Solution1029 {
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0;
        int N = costs.length / 2;
        Arrays.sort(costs, Comparator.comparing(cost -> cost[0] - cost[1]));
        for (int i = 0; i < N; i++) {
            ans += costs[i][0] + costs[i + N][1];
        }
        return ans;
    }
}

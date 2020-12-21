package com.company.solution;

/**
 * 5340. 统计有序矩阵中的负数
 */
public class Solution5340 {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] ints : grid) {
            for (int i = ints.length - 1; i >= 0; i--) {
                if (ints[i] >= 0) {
                    break;
                }
                ans++;
            }
        }
        return ans;
    }
}

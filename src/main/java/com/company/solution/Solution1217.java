package com.company.solution;

/**
 * 1217. 玩筹码
 */
public class Solution1217 {
    public int minCostToMoveChips(int[] chips) {
        int oddCount = 0;
        int evenCount = 0;
        for (int chip : chips) {
            if (chip % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }

    public int minCostToMoveChips2(int[] chips) {
        int[] magic = new int[2];
        for (int chip :
                chips) {
            magic[chip & 1]++;
        }
        return Math.min(magic[0], magic[1]);
    }
}

package com.company.solution;

/**
 * 914. 卡牌分组
 */
public class Solution914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] counts = new int[10000];
        for (int num : deck) {
            counts[num]++;
        }

        int commonDivisor = -1;
        for (int i = 0; i < 10000; i++) {
            int count = counts[i];
            if (count > 0) {
                commonDivisor = commonDivisor == -1 ? count : divisor(commonDivisor, count);
            }
        }
        return commonDivisor >= 2;
    }

    /**
     * 2 % 5 = 2
     * 基于这个规律自动进行大小数互换
     */
    private int divisor(int large, int small) {
        return small == 0 ? large : divisor(small, large % small);
    }
}

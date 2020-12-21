package com.company.offer;

import java.util.stream.Stream;

/**
 * 面试题17. 打印从1到最大的n位数
 */
public class Offer17 {
    public int[] printNumbers(int n) {
        int upper = 1;
        for (int i = 0; i < n; i++) {
            upper *= 10;
        }

        int[] ans = new int[upper - 1];
        for (int i = 1; i < upper; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }
}

package com.company.offer;

/**
 * 面试题62. 圆圈中最后剩下的数字
 * TODO:逃课
 */
public class Offer62 {
    /**
     * TODO：理解解题原理
     */
    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i != n + 1; i++) {
            ans = (m + ans) % i;
        }
        return ans;
    }
}

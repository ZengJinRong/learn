package com.company.solution;

/**
 * 461. 汉明距离
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int distance = 0;
        while (x != 0 || y != 0) {
            distance += x % 2 == y % 2 ? 0 : 1;
            x = x >>> 1;
            y = y >>> 1;
        }
        return distance;
    }

    public int hammingDistance2(int x, int y) {
        int distance = 0;
        while (x != 0 || y != 0) {
            distance += (x & 1) == (y & 1) ? 0 : 1;
            x = x >>> 1;
            y = y >>> 1;
        }
        return distance;
    }

    /**
     * TODO:解题原理
     */
    public int hammingDistance3(int x, int y) {
        int i = x ^ y;
        int count = 0;
        while (i != 0) {
            if ((i & 1) == 1) {
                count++;
            }
            i = i >>> 1;
        }
        return count;
    }
}

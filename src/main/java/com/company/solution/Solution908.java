package com.company.solution;

/**
 * 908. 最小差值 I
 */
public class Solution908 {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return Math.max(0, max - min - 2 * K);
    }
}

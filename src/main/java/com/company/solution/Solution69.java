package com.company.solution;

/**
 * 69. x 的平方根
 * TODO:其他解法
 */
public class Solution69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2;
        int right = x / 2;
        long middleSquare;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            middleSquare = (long) middle * middle;
            if (middleSquare > x) {
                right = middle - 1;
            } else if (middleSquare < x) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right;
    }
}

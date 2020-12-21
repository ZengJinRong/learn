package com.company.solution;

/**
 * 29. 两数相除
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
        boolean isNegative = false;
        if (dividend > 0) {
            dividend = -dividend;
            isNegative = !isNegative;
        }
        if (divisor > 0) {
            divisor = -divisor;
            isNegative = !isNegative;
        }
        int quotient = 0;
        for (int i = 0; i >= dividend - divisor; i += divisor) {
            quotient++;
        }

        if (quotient < 0) {
            return Integer.MAX_VALUE;
        }

        if (isNegative) {
            quotient = -quotient;
        }
        return quotient;
    }


    /**
     * TODO：理解解题思路
     */
    public int divide2(int dividend, int divisor) {
        boolean sign = (dividend > 0) ^ (divisor > 0);
        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }
        int quotient = 0;
        while (dividend <= divisor) {
            int temp_result = -1;
            int temp_divisor = divisor;
            while (dividend <= (temp_divisor << 1)) {
                if (temp_divisor <= (Integer.MIN_VALUE >> 1)) {
                    break;
                }
                temp_result = temp_result << 1;
                temp_divisor = temp_divisor << 1;
            }
            dividend = dividend - temp_divisor;
            quotient += temp_result;
        }
        if (!sign) {
            if (quotient <= Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            quotient = -quotient;
        }
        return quotient;
    }
}

package com.company.solution;

/**
 * 1009. 十进制整数的反码
 */
public class Solution1009 {
    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }
        int digit = 0;
        int n = N;
        while (n != 0) {
            n = n >>> 1;
            digit = (digit << 1) + 1;
        }
        return (~N) & digit;
    }

    public int bitwiseComplement2(int N) {
        if (N == 0) {
            return 1;
        }
        int m = 0;
        int digit = 1;
        while (N != 0) {
            m += ((~N) & 1) * digit;
            digit = digit << 1;
            N = N >>> 1;
        }
        return m;
    }
}

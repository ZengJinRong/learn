package com.company.solution;

/**
 * 231. 2的幂
 */
public class Solution231 {

    /**
     * FIXME:超出时间限制
     */
    public boolean isPowerOfTwo(int n) {
        int powerOfTwo = 1;
        while (powerOfTwo < n) {
            powerOfTwo = powerOfTwo << 1;
        }
        return n == powerOfTwo;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    /**
     * 位运算
     * TODO:理解运算原理
     */
    public boolean isPowerOfTwo3(int n) {
        if (n == 0) {
            return false;
        }
        return ((long) n & (-(long) n)) == (long) n;
    }

}

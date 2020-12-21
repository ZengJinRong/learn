package com.company.solution;

/**
 * 326. 3的幂
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    public boolean isPowerOfThree2(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    /**
     * int类型下,3的最大幂为:3^19,即:1162261467
     * 3为质数
     * 当 0<= n <=19 时，3^19 % 3^n == 0
     */
    public boolean isPowerOfThree3(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}

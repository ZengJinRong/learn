package com.company.solution;

/**
 * 365. 水壶问题
 */
public class Solution365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x == 0 && y == 0) return z == 0;
        return z == 0 || (z % gcd(x, y) == 0 && x + y >= z);
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        int r = x % y;
        return gcd(y, r);
    }
}

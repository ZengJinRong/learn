package com.company.solution;

/**
 * 5171. 最接近的因数
 */
public class Solution5175 {
    public int[] closestDivisors(int num) {
        int[] divisors1 = divisors(num + 1);
        int[] divisors2 = divisors(num + 2);
        int gap1 = divisors1[1] - divisors1[0];
        int gap2 = divisors2[1] - divisors2[0];
        return gap1 <= gap2 ? divisors1 : divisors2;
    }

    private int[] divisors(int num) {
        double sqrt = Math.sqrt(num);
        int left = (int) sqrt;
        int right = (int) sqrt;
        while (left * right != num) {
            if (left * right > num) {
                left--;
                right = num / left;
            } else {
                right++;
            }
        }
        return new int[]{left, right};
    }
}

package com.company.solution;

/**
 * 258. 各位相加
 */
public class Solution258 {
    public int addDigits(int num) {
        while (num / 10 != 0) {
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    /**
     * TODO:理解解题思路
     */
    public int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }
}

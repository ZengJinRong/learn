package com.company.solution;

/**
 * 476. 数字的补数
 * TODO:理解解题思路
 */
public class Solution476 {
    public int findComplement(int num) {
        long ans = 1;
        while (ans <= num) {
            ans = ans << 1;
        }
        ans--;
        return (int) ans ^ num;
    }
}

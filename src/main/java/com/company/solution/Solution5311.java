package com.company.solution;

/**
 * 5311. 将数字变成 0 的操作次数
 */
public class Solution5311 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            count++;
        }
        return count;
    }
}

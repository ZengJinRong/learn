package com.company.solution;

/**
 * 面试题64. 求1+2+…+n
 * TODO:理解解题思路
 */
public class Solution64 {
    public int sumNums(int n) {
        int sum = n;
        boolean b = (n > 0) && (sum += sumNums(n - 1)) > 0;
        return sum;
    }
}

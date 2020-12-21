package com.company.solution;

/**
 * 1304. 和为零的N个唯一整数
 * int[]中元素初始化默认值为0
 */
public class Solution1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int middle = n / 2;
        int index = 0;
        for (int i = -middle; i < 0; i++) {
            ans[index] = i;
            index++;
        }
        for (int i = middle; i > 0; i--) {
            ans[index] = i;
            index++;
        }
        return ans;
    }

    public int[] sumZero2(int n) {
        int[] ans = new int[n];
        int index = 0;
        int middle = n / 2;
        for (int i = 1; i <= middle; i++) {
            ans[index++] = i;
            ans[index++] = -i;
        }
        return ans;
    }
}

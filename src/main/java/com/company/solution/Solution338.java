package com.company.solution;

/**
 * 338. 比特位计数
 */
public class Solution338 {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int j = i;
            int count = 0;
            while (j != 0) {
                if ((j & 1) == 1) {
                    count++;
                }
                j = j >>> 1;
            }
            ans[i] = count;
        }
        return ans;
    }

    // TODO: 2020/2/7 其他解法
}

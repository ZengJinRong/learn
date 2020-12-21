package com.company.solution;

/**
 * 942. 增减字符串匹配
 */
public class Solution942 {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] ans = new int[length + 1];
        int min = 0;
        int max = length;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'I') {
                ans[i] = min;
                min++;
            } else {
                ans[i] = max;
                max--;
            }
        }
        ans[length] = max;
        return ans;
    }

    public int[] diStringMatch2(String S) {
        int N = S.length();
        int lo = 0;
        int hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I') {
                ans[i] = lo++;
            } else {
                ans[i] = hi--;
            }
        }

        ans[N] = lo;
        return ans;
    }
}

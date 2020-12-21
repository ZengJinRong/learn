package com.company.solution;

/**
 * 821. 字符的最短距离
 */
public class Solution821 {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        char[] chars = S.toCharArray();
        int prev = -10000;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        prev = 10000;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == C) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }
}

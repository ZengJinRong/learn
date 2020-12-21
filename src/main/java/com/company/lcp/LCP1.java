package com.company.lcp;

/**
 * LCP 1. 猜数字
 */
public class LCP1 {
    public int game(int[] guess, int[] answer) {
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) {
                ans++;
            }
        }
        return ans;
    }
}

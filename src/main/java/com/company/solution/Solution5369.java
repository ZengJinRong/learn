package com.company.solution;

/**
 * 5369. 统计作战单位数
 */
public class Solution5369 {
    public int numTeams(int[] rating) {
        int ans = 0;

        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i; j < rating.length - 1; j++) {
                if (rating[j] <= rating[i]) {
                    continue;
                }
                for (int k = j; k < rating.length; k++) {
                    if (rating[k] > rating[j]) {
                        ans++;
                    }
                }
            }
        }

        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i; j < rating.length - 1; j++) {
                if (rating[j] >= rating[i]) {
                    continue;
                }
                for (int k = j; k < rating.length; k++) {
                    if (rating[k] < rating[j]) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

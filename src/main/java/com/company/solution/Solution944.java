package com.company.solution;

/**
 * 944. 删列造序
 */
public class Solution944 {
    public int minDeletionSize(String[] A) {
        int yLen = A.length;
        int xLen = A[0].length();
        int ans = 0;
        for (int x = 0; x < xLen; x++) {
            for (int y = 0; y < yLen - 1; y++) {
                if (A[y].charAt(x) > A[y + 1].charAt(x)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

}

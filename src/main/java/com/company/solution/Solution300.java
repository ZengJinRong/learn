package com.company.solution;

/**
 * 300. 最长上升子序列
 */
public class Solution300 {

    /**
     * TODO:理解解题思路
     */
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }


    /**
     * FIXME:题意理解错误
     */
/*    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int slow = -1;
        int fast = 0;
        while (fast < nums.length) {
            if (fast == nums.length - 1 || nums[fast + 1] <= nums[fast]) {
                ans = Math.max(ans, fast - slow);
                slow = fast;
            }
            fast++;
        }
        return ans;
    }*/
}

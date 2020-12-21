package com.company.solution;

/**
 * 3. 无重复字符的最长子串
 */
public class Solution3 {

    /**
     * 优化的滑动窗口法
     * TODO:理解解题思路
     */
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}

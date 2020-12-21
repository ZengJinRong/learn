package com.company.solution;

/**
 * 171. Excel表列序号
 */
public class Solution171 {
    public int titleToNumber(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            int digit = c - 64;
            ans = ans * 26 + digit;
        }
        return ans;
    }

    public int titleToNumber2(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int digit = c - 64;
            ans += Math.pow(26, chars.length - 1 - i) * digit;
        }
        return ans;
    }
}

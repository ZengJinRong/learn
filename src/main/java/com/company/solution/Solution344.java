package com.company.solution;

/**
 * 344. 反转字符串
 */
public class Solution344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < (s.length + 1) / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}

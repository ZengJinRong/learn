package com.company.solution;

/**
 * 1370. 上升下降字符串
 */
public class Solution1370 {
    public String sortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder(s.length());
        boolean reverse = false;
        while (stringBuilder.length() < s.length()) {
            if (reverse) {
                for (int i = count.length - 1; i >= 0; i--) {
                    if (count[i] > 0) {
                        stringBuilder.append((char) ('a' + i));
                        count[i]--;
                    }
                }
            } else {
                for (int i = 0; i < count.length; i++) {
                    if (count[i] > 0) {
                        stringBuilder.append((char) ('a' + i));
                        count[i]--;
                    }
                }
            }
            reverse = !reverse;
        }
        return stringBuilder.toString();
    }
}

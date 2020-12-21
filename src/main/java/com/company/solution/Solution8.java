package com.company.solution;

/**
 * 8. 字符串转换整数 (atoi)
 */
public class Solution8 {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        long ans = 0;
        boolean positive = true;
        if (str.charAt(0) == '-') {
            positive = false;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }

        int j = 0;
        char[] chars = str.toCharArray();
        while (j < chars.length - 1 && chars[j] == '0') {
            j++;
        }

        for (int i = j; i < Math.min(chars.length, j + 11); i++) {
            char c = chars[i];
            if ('0' <= c && c <= '9') {
                ans = ans * 10 + (c - '0');
            } else {
                break;
            }
        }

        if (positive) {
            return (int) Math.min(ans, Integer.MAX_VALUE);
        } else {
            return (int) Math.max(-ans, Integer.MIN_VALUE);
        }
    }


    public int myAtoi2(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        long ans = 0;
        boolean positive = true;
        if (str.charAt(0) == '-') {
            positive = false;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }

        int digit = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (digit != 0 || c != '0') {
                if ('0' <= c && c <= '9') {
                    ans = ans * 10 + (c - '0');
                    digit++;
                } else {
                    break;
                }
            }
        }

        if (digit > 11) {
            return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (positive) {
            return (int) Math.min(ans, Integer.MAX_VALUE);
        } else {
            return (int) Math.max(-ans, Integer.MIN_VALUE);
        }
    }
}

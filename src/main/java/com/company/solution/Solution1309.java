package com.company.solution;

/**
 * 1309. 解码字母到整数映射
 */
public class Solution1309 {
    public String freqAlphabets(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            String valueStr;
            int value;
            char c;
            if (s.charAt(i) == '#') {
                valueStr = s.substring(i - 2, i);
                value = Integer.parseInt(valueStr);
                c = (char) ('j' + value - 10);
                stringBuilder.append(c);
                i -= 2;
            } else {
                valueStr = s.substring(i, i + 1);
                value = Integer.parseInt(valueStr);
                c = (char) ('a' + value - 1);
                stringBuilder.append(c);
            }
        }
        return stringBuilder.reverse().toString();
    }

    public String freqAlphabets2(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String valueStr;
            int value;
            char c;
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                valueStr = s.substring(i, i + 2);
                value = Integer.parseInt(valueStr);
                c = (char) ('j' + value - 10);
                stringBuilder.append(c);
                i += 2;
            } else {
                valueStr = s.substring(i, i + 1);
                value = Integer.parseInt(valueStr);
                c = (char) ('a' + value - 1);
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}

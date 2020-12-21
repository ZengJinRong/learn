package com.company.solution;

/**
 * 557. 反转字符串中的单词 III
 */
public class Solution557 {
    public String reverseWords(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.split(" ");
        for (String string : strings) {
            stringBuilder.append(" ");
            char[] chars = string.toCharArray();
            for (int i = 0; i <= (chars.length - 1) / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }
            stringBuilder.append(chars);
        }
        stringBuilder.deleteCharAt(0);
        return stringBuilder.toString();
    }
}


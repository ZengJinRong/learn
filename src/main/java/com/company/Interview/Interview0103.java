package com.company.Interview;

/**
 * 面试题 01.03. URL化
 */
public class Interview0103 {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}

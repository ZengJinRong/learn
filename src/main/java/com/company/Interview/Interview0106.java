package com.company.Interview;

/**
 * 面试题 01.06. 字符串压缩
 */
public class Interview0106 {
    public String compressString(String S) {
        if (S.length() < 3) {
            return S;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = S.toCharArray();
        char c = chars[0];
        int combo = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != c) {
                stringBuilder.append(c).append(combo);
                c = chars[i];
                combo = 1;
            } else {
                combo++;
            }
        }
        stringBuilder.append(c).append(combo);
        return stringBuilder.length() < S.length() ? stringBuilder.toString() : S;
    }
}

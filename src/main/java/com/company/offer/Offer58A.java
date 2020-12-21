package com.company.offer;

/**
 * 面试题58 - I. 翻转单词顺序
 * 相似题：151. 翻转字符串里的单词
 * TODO：其他解法
 */
public class Offer58A {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (int i = words.length - 1; i > 0; i--) {
            String word = words[i].trim();
            if (word.length() != 0) {
                stringBuilder.append(word).append(' ');
            }
        }
        stringBuilder.append(words[0].trim());
        return stringBuilder.toString();
    }
}

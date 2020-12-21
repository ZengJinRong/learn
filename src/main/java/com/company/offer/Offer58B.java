package com.company.offer;

/**
 * 面试题58 - II. 左旋转字符串
 */
public class Offer58B {
    public String reverseLeftWords(String s, int n) {
        n = n % s.length();
        return s.substring(n) + s.substring(0, n);
    }
}

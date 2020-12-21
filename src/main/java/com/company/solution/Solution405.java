package com.company.solution;

/**
 * 405. 数字转换为十六进制数
 * TODO:理解解题思路
 */
public class Solution405 {
    public String toHex(int num) {
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder s = new StringBuilder();
        while (num != 0) {
            int end = num & 15;
            s.insert(0, hex[end]);
            //无符号右移
            num >>>= 4;
        }
        if (s.length() == 0) {
            s = new StringBuilder("0");
        }
        return s.toString();
    }
}

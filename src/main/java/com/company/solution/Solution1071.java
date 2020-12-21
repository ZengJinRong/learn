package com.company.solution;

/**
 * 1071. 字符串的最大公因子
 * TODO:理解解题思路
 */
public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        boolean flag = (len1 > len2) ? isPresence(str1, str2) : isPresence(str2, str1);
        if (!flag) {
            return "";
        }

        // 求len1 和 len2 的最小公约数
        int count = gcd(len1, len2);
        return str1.substring(0, count);
    }

    private boolean isPresence(String str1, String str2) {
        int len = str2.length();
        // 包含的元素一致，且顺序对得上
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i % len)) return false;
        }
        return true;
    }

    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}

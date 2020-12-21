package com.company.solution;

/**
 * 5352. 生成每种字符都是奇数个的字符串
 */
public class Solution5352 {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                stringBuilder.append('a');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                stringBuilder.append('a');
            }
            stringBuilder.append('b');
        }

        return stringBuilder.toString();
    }
}

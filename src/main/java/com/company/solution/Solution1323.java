package com.company.solution;

/**
 * 1323. 6 和 9 组成的最大数字
 */
public class Solution1323 {
    public int maximum69Number(int num) {
        String str = Integer.toString(num).replaceFirst("6", "9");
        return Integer.parseInt(str);
    }


    public int maximum69Number2(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }
        String str = new String(chars);
        return Integer.parseInt(str);
    }
}

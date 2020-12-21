package com.company.solution;


/**
 * 7. 整数反转
 */
public class Solution7 {
    public int reverse(int x) {
        boolean negative = x < 0;
        x = Math.abs(x);
        String str = String.valueOf(x);
        if (negative) {
            str = str.replaceFirst("-", "");
        }
        char[] digits = str.toCharArray();
        int middle = digits.length / 2;
        for (int i = 0; i < middle; i++) {
            char temp = digits[i];
            digits[i] = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = temp;
        }
        try {
            int ans = Integer.parseInt(new String(digits));
            if (negative) {
                return -ans;
            } else {
                return ans;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    public int reverse2(int x) {
        boolean negative = false;
        String str = Integer.toString(x);
        if (x < 0) {
            negative = true;
            str = str.replaceAll("-", "");
        }
        char[] charsIn = str.toCharArray();
        int length = charsIn.length;
        char[] charsOut = new char[length];
        for (int i = 0; i < length; i++) {
            charsOut[i] = charsIn[length - i - 1];
        }
        long result = Long.parseLong(new String(charsOut));
        if (negative) {
            result = -result;
            if (result < Integer.MIN_VALUE) {
                result = 0;
            }
        } else if (result > Integer.MAX_VALUE) {
            result = 0;
        }
        return (int) result;
    }
}

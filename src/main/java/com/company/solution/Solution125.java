package com.company.solution;

/**
 * 125. 验证回文串
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char charLeft = chars[left];
            if (isUpperCaseLetter(charLeft)) {
                charLeft = Character.toLowerCase(charLeft);
            } else if (!isDigitOrLowerCaseLetter(charLeft)) {
                left++;
                continue;
            }

            char charRight = chars[right];
            if (isUpperCaseLetter(charRight)) {
                charRight = Character.toLowerCase(charRight);
            } else if (!isDigitOrLowerCaseLetter(charRight)) {
                right--;
                continue;
            }
            if (charLeft == charRight) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isDigitOrLowerCaseLetter(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    public boolean isUpperCaseLetter(char c) {
        return c >= 'A' && c <= 'Z';
    }
}

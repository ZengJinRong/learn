package com.company.solution;

/**
 * 5151. 破坏回文串
 */
public class Solution5151 {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }
        char[] chars = palindrome.toCharArray();
        if (palindrome.replaceAll("a", "").length() < 2) {
            chars[chars.length - 1]++;
            return new String(chars);
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
        }
        return new String(chars);
    }
}

package com.company.solution;

/**
 * 389. 找不同
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']--;
        }
        for (char c : t.toCharArray()) {
            int index = c - 'a';
            if (counts[index] == 0) {
                return c;
            }
            counts[index]++;
        }
        return ' ';
    }

    public char findTheDifference2(String s, String t) {
        int[] counts = new int[26];
        for (char c : t.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            counts[c - 'a']--;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 1) {
                return (char) ('a' + i);
            }
        }
        return ' ';
    }
}

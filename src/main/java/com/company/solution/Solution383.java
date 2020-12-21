package com.company.solution;

/**
 * 383. 赎金信
 */
public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : magazine.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i : count) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct3(String ransom, String magazine) {
        if (magazine.length() < ransom.length()) {
            return false;
        }
        int caps[] = new int[26];
        for (char c : ransom.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 'a']);
            if (index == -1) {
                return false;
            }
            caps[c - 'a'] = index + 1;
        }
        return true;
    }
}

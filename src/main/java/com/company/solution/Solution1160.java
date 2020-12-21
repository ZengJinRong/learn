package com.company.solution;

/**
 * 1160. 拼写单词
 */
public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for (char c : chars.toCharArray()) {
            counts[c - 'a']++;
        }
        int ans = 0;
        for (String word : words) {
            int[] need = new int[26];
            boolean isGrasp = true;
            for (char c : word.toCharArray()) {
                need[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (need[i] > counts[i]) {
                    isGrasp = false;
                    break;
                }
            }

            if (isGrasp) {
                ans+=word.length();
            }
        }
        return ans;
    }

    // TODO: 2020/2/13 其他解法
}

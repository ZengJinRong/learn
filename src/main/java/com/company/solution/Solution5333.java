package com.company.solution;

import java.util.HashMap;

/**
 * 5333. 制造字母异位词的最小步骤数
 */
public class Solution5333 {
    public int minSteps(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] count = new int[26];

        for (char sChar : sChars) {
            count[sChar - 'a']++;
        }

        for (char tChar : tChars) {
            count[tChar - 'a']--;
        }

        int ans = 0;
        for (int value : count) {
            if (value > 0) {
                ans += value;
            }
        }
        return ans;
    }
}

package com.company.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 893. 特殊等价字符串组
 */
public class Solution893 {

    /**
     * TODO:理解解题思路
     */
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            int[] count = new int[52];
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                count[c - 'a' + (i % 2) * 26]++;
            }
            String key = Arrays.toString(count);
            set.add(key);
        }
        return set.size();
    }
}

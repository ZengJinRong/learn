package com.company.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题50. 第一个只出现一次的字符
 */
public class Offer50 {
    public char firstUniqChar(String s) {
        int[] counts = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            counts[c - 'a']++;
        }
        for (char c : chars) {
            if (counts[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }

    public char firstUniqChar2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : chars) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }
}

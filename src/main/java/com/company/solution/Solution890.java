package com.company.solution;

import java.util.*;

/**
 * 890. 查找和替换模式
 */
public class Solution890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        char[] patternChars = pattern.toCharArray();
        for (String word : words) {
            if (conformPattern(word, patternChars)) {
                list.add(word);
            }
        }
        return list;
    }

    private boolean conformPattern(String word, char[] patternChars) {
        char[] chars = word.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char patternChar = patternChars[i];
            if (map.containsKey(c)) {
                if (map.get(c) != patternChar) {
                    return false;
                }
            } else {
                if (set.contains(patternChar)) {
                    return false;
                }
                map.put(c, patternChar);
                set.add(patternChar);
            }
        }
        return true;
    }


    public List<String> findAndReplacePattern2(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word: words)
            if (match(word, pattern))
                ans.add(word);
        return ans;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < word.length(); ++i) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!m1.containsKey(w)) m1.put(w, p);
            if (!m2.containsKey(p)) m2.put(p, w);
            if (m1.get(w) != p || m2.get(p) != w)
                return false;
        }

        return true;
    }
}

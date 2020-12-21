package com.company.solution;

import java.util.*;

/**
 * 884. 两句话中的不常见单词
 */
public class Solution884 {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> list = new ArrayList<>();
        String[] wordsA = A.split(" ");
        String[] wordsB = B.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String wordA : wordsA) {
            map.put(wordA, map.getOrDefault(wordA, 0) + 1);
        }

        for (String wordB : wordsB) {
            map.put(wordB, map.getOrDefault(wordB, 0) + 1);
        }

        Set<String> words = map.keySet();
        for (String word : words) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}

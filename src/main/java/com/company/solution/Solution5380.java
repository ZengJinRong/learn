package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 5380. 数组中的字符串匹配
 */
public class Solution5380 {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(word)) {
                    list.add(word);
                    break;
                }
            }
        }
        return list;
    }
}

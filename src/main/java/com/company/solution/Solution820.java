package com.company.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 820. 单词的压缩编码
 * TODO:逃课
 */
public class Solution820 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            for (int k = 1; k < word.length(); ++k)
                good.remove(word.substring(k));
        }

        int ans = 0;
        for (String word : good)
            ans += word.length() + 1;
        return ans;
    }
}

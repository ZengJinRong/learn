package com.company.Interview;

/**
 * 面试题 10.05. 稀疏数组搜索
 */
public class Interview1005 {
    public int findString2(String[] words, String s) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 0) {
                continue;
            }
            if (s.equals(word)) {
                return i;
            }
        }
        return -1;
    }
}

package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 1324. 竖直打印单词
 */
public class Solution1324 {
    public List<String> printVertically(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {

            } else {

                while (chars[i + 1] == ' ') {
                    i++;
                }
            }
        }
        return ans;
    }

}

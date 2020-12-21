package com.company.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1021. 删除最外层的括号
 */
public class Solution1021 {
    public String removeOuterParentheses(String S) {
        List<String> List = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        int singleLeft = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                singleLeft++;
            } else {
                singleLeft--;
            }
            stringBuilder.append(c);
            if (singleLeft == 0) {
                List.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            }
        }

        for (String str : List) {
            stringBuilder.append(str.substring(1, str.length() - 1));
        }
        return stringBuilder.toString();
    }

    /**
     * TODO:理解解题思路
     */
    public String removeOuterParentheses2(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        int level = 0;
        for (char c : S.toCharArray()) {
            if (c == ')') {
                level--;
            }
            if (level > 0) {
                stringBuilder.append(c);
            }
            if (c == '(') {
                level++;
            }
        }
        return stringBuilder.toString();
    }
}

package com.company.Interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 面试题 16.20. T9键盘
 */
public class Interview1620 {
    private static int[] map = new int[]{'2', '2', '2', '3', '3', '3',
            '4', '4', '4', '5', '5', '5', '6', '6', '6',
            '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9'};

    public List<String> getValidT9Words(String num, String[] words) {
        List<String> list = new ArrayList<>();
        char[] numChars = num.toCharArray();
        for (String word : words) {
            if (match(word, numChars)) {
                list.add(word);
            }
        }
        return list;
    }

    private boolean match(String word, char[] numChars) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (map[c - 'a'] != numChars[i]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 正则表达式
     * 优雅简洁，速度慢
     */
    public List<String> getValidT9Words2(String num, String[] words) {
        String[] patternArr = new String[]{"[a-c]", "[d-f]", "[g-i]", "[j-l]", "[m-o]", "[p-s]", "[t-v]", "[w-z]"};
        int len = num.length();
        StringBuilder sb = new StringBuilder(len * 5);
        for (int i = 0; i < len; ++i) {
            sb.append(patternArr[num.charAt(i) - '2']);
        }
        LinkedList<String> list = new LinkedList<>();
        String pattern = sb.toString();
        for (String word : words) {
            if (word.matches(pattern)) {
                list.addLast(word);
            }
        }
        return list;
    }
}

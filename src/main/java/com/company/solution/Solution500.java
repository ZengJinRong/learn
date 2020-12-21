package com.company.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 500. 键盘行
 */
public class Solution500 {
    public String[] findWords(String[] words) {
        char[] chars1 = "qwertyuiop".toCharArray();
        char[] chars2 = "asdfghjkl".toCharArray();
        char[] chars3 = "zxcvbnm".toCharArray();

        List<String> list = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();

            boolean isOneLine = false;
            if (containsChar(chars1, chars[0])) {
                isOneLine = containsAllChars(chars1, chars);
            } else if (containsChar(chars2, chars[0])) {
                isOneLine = containsAllChars(chars2, chars);
            } else {
                isOneLine = containsAllChars(chars3, chars);
            }
            if (isOneLine) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }

    private boolean containsAllChars(char[] chars1, char[] chars2) {
        for (char c : chars2) {
            if (!containsChar(chars1, c)) {
                return false;
            }
        }
        return true;
    }

    private boolean containsChar(char[] chars, char c) {
        for (char aChar : chars) {
            if (aChar == c) {
                return true;
            }
        }
        return false;
    }




    public String[] findWords2(String[] words) {
        if (words == null) {
            return null;
        }

        List<String> ans = new ArrayList<>();

        // 字典行
        String[] lines = new String[]{
                "qwertyuiop",
                "asdfghjkl",
                "zxcvbnm"
        };

        // 挨个单词匹配是否满足条件
        for (String word : words) {
            if (judge(word.toLowerCase(), lines)) {
                ans.add(word);
            }
        }

        // 刚看到的时候有点疑惑返回值为什么不是List<String>而是String[]
        // list可直接利用API转换为String数组即可
        return ans.toArray(new String[0]);
    }

    private boolean judge(String word, String[] lines) {
        boolean ok = true;
        String find = null;

        // 先用word首字符确定属于哪一行
        for (String line : lines) {
            if (line.indexOf(word.charAt(0)) > -1) {
                find = line;
                break;
            }
        }

        if (find == null) {
            ok = false;
            return ok;
        }

        // 判断word字符串所有字符是否都属于同一行
        for (int i = 1; i < word.length(); i++) {
            if (find.indexOf(word.charAt(i)) < 0) {
                ok = false;
                break;
            }
        }

        return ok;
    }

}

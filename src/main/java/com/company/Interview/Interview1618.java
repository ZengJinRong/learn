package com.company.Interview;

import java.util.Arrays;

/**
 * 面试题 16.18. 模式匹配
 * TODO:逃课
 */
public class Interview1618 {
    public boolean patternMatching(String pattern, String value) {
        if (pattern.length() == 0) {
            return value.length() == 0;
        }

        int count_a = 0;
        int count_b = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') count_a++;
            else count_b++;
        }

        if (value.length() == 0) {
            return count_a == 0 || count_b == 0;
        }

        int pattern_pos = 0;
        if (count_a == 0 || count_b == 0) {
            String patternString = value.substring(0, (value.length() / (count_a + count_b)));
            if (patternString.length() * (count_a + count_b) != value.length()) return false;
            int patternStringLength = patternString.length();
            for (int i = 0; i < value.length(); i += patternStringLength)
                if (!value.substring(i, i + patternStringLength).equals(patternString)) return false;
            return true;
        }

        int pattern_a_length = 0;
        int pattern_b_length = 0;
        String[] res = new String[2];
        int max_pattern_a = value.length() / count_a;
        for (; pattern_a_length <= max_pattern_a; pattern_a_length++) {
            Arrays.fill(res, "");
            pattern_b_length = (value.length() - count_a * pattern_a_length) / count_b;
            if (pattern_b_length * count_b + count_a * pattern_a_length != value.length()) continue;
            pattern_pos = 0;
            int i = 0;
            for (; i < pattern.length(); i++) {
                char ch = pattern.charAt(i);
                if (ch == 'a') {
                    if (pattern_a_length != 0 && res[0].equals(""))
                        res[0] = value.substring(pattern_pos, pattern_pos + pattern_a_length);
                    else if (pattern_pos + pattern_a_length > value.length()
                            || !value.substring(pattern_pos, pattern_pos + pattern_a_length).equals(res[0])) break;
                    pattern_pos += pattern_a_length;
                } else {
                    if (pattern_b_length != 0 && res[1].equals(""))
                        res[1] = value.substring(pattern_pos, pattern_pos + pattern_b_length);
                    else if (pattern_pos + pattern_b_length > value.length()
                            || !value.substring(pattern_pos, pattern_pos + pattern_b_length).equals(res[1])) break;
                    pattern_pos += pattern_b_length;
                }
                if (pattern_a_length != 0 && pattern_b_length != 0 && res[0].equals(res[1])) break;
            }
            if (i == pattern.length()) return true;
        }

        return false;
    }
}

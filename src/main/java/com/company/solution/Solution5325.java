package com.company.solution;

import java.util.HashSet;

/**
 * 5325. 包含所有三种字符的子字符串数目
 * FIXME:超出时间限制
 */
public class Solution5325 {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        a:
        for (int i = 0; i <= s.length() - 3; i++) {
            for (int j = s.length(); j >= i + 3; j--) {
                boolean[] flags = new boolean[3];
                for (int k = i; k < j; k++) {
                    flags[chars[k] - 'a'] = true;
                }
                if (flags[0] && flags[1] && flags[2]) {
                    ans++;

                } else {
                    continue a;
                }
            }
        }
        return ans;
    }

    public int numberOfSubstrings3(String s) {
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        a:
        for (int i = 0; i <= s.length() - 3; i++) {
            for (int j = s.length(); j >= i + 3; j--) {
                String str = s.substring(i, j);
                if (set.contains(str)) {
                    ans++;
                } else if (str.contains("a") && str.contains("b") && str.contains("c")) {
                    ans++;
                    set.add(str);
                } else {
                    continue a;
                }
            }
        }
        return ans;
    }

    public int numberOfSubstrings2(String s) {
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 3; i <= s.length(); i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                String str = s.substring(j, j + i);
                if (set.contains(str)) {
                    ans++;
                } else if (str.contains("a") && str.contains("b") && str.contains("c")) {
                    ans++;
                    set.add(str);
                }
            }
        }
        return ans;
    }
}

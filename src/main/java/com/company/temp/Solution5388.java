package com.company.temp;

import java.util.ArrayList;
import java.util.List;

/**
 * 5388. 重新格式化字符串
 */
public class Solution5388 {
    public String reformat(String s) {
        List<Character> digitalList = new ArrayList<>();
        List<Character> letterList = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ('0' <= c && c <= '9') {
                digitalList.add(c);
            } else if ('a' <= c && c <= 'z') {
                letterList.add(c);
            }
        }
        return getReformattedString(digitalList, letterList);
    }

    private String getReformattedString(List<Character> list1, List<Character> list2) {
        if (Math.abs(list1.size() - list2.size()) > 1) {
            return "";
        }

        if (list1.size() < list2.size()) {
            return getReformattedString(list2, list1);
        }
        int size = list1.size() + list2.size();
        StringBuilder stringBuilder = new StringBuilder(size);
        for (int i = 0; i < list2.size(); i++) {
            stringBuilder.append(list1.get(i)).append(list2.get(i));
        }
        if (list1.size() > list2.size()) {
            stringBuilder.append(list1.get(list1.size() - 1));
        }
        return stringBuilder.toString();
    }
}

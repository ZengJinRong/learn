package com.company.solution;


import java.util.*;

/**
 * 49. 字母异位词分组
 * TODO:其他解法
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String strSorted = String.valueOf(chars);
            if (map.containsKey(strSorted)) {
                map.get(strSorted).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(strSorted, list);
            }
        }
        Set<String> keySet = map.keySet();
        List<List<String>> ans = new ArrayList<>();
        for (String key : keySet) {
            ans.add(map.get(key));
        }
        return ans;
    }
}

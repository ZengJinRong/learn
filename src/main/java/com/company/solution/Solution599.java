package com.company.solution;

import java.util.*;

/**
 * 599. 两个列表的最小索引总和
 * TODO:其他解题方法
 */
public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> list = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String str = list2[i];
            if (!map.containsKey(str)) {
                continue;
            }
            int indexSum = map.get(str) + i;
            if (indexSum < minIndexSum) {
                minIndexSum = indexSum;
                list = new ArrayList<>();
                list.add(str);
            } else if (indexSum == minIndexSum) {
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }
}

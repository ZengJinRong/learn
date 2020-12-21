package com.company.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1287. 有序数组中出现次数超过25%的元素
 * TODO:二分查找法
 */
public class Solution1287 {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() * 4 > arr.length) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

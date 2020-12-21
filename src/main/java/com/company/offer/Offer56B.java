package com.company.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题56 - II. 数组中数字出现的次数 II
 * TODO:其他解题思路
 */
public class Offer56B {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

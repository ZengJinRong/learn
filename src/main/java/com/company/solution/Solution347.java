package com.company.solution;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 * TODO:其他解题思路
 */
public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(entries);
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(list);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i).getKey());
        }
        return ans;
    }
}

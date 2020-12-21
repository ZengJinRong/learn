package com.company.solution;

import java.util.*;

/**
 * 5329. 数组大小减半
 */
public class Solution5329 {
    public int minSetSize(int[] arr) {
        int length = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(entries);

        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(list);

        int ans = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            count += entry.getValue();
            ans++;
            if (count * 2 >= length) {
                return ans;
            }
        }
        return ans;
    }
}

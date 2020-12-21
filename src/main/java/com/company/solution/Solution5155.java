package com.company.solution;

import java.util.*;

/**
 * 5155. 数组序号转换
 */
public class Solution5155 {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        int[] sortArr = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortArr.length; i++) {
            map.put(sortArr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]) + 1;
        }
        return ans;
    }
}

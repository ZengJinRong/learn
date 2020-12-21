package com.company.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. 最小绝对差
 */
public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> lists;
        lists = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff > minDiff) {
                continue;
            }
            if (diff < minDiff) {
                minDiff = diff;
                lists = new ArrayList<>();

            }
            List<Integer> list = new ArrayList<>();
            list.add(arr[i - 1]);
            list.add(arr[i]);
            lists.add(list);
        }
        return lists;
    }
}

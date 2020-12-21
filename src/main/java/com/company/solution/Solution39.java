package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. 组合总和
 * TODO:理解解题思路
 */
public class Solution39 {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        process(0, candidates, target, list);
        return lists;
    }

    private void process(int start, int[] candidates, int target, List<Integer> list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int candidate = candidates[i];
            list.add(candidate);
            process(i, candidates, target - candidate, list);
            list.remove(list.size() - 1);
        }
    }
}

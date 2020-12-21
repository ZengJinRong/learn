package com.company.error;

import java.util.ArrayList;
import java.util.List;

/**
 * 5359. 最大的团队表现值
 * FIXME:超出内存限制
 */
public class Solution5359 {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int length = speed.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        List<List<Integer>> lists = getCombinationResult(k, list);
        int ans = 0;
        for (List<Integer> indexList : lists) {
            long speedSum = 0;
            long efficiencyMin = Integer.MAX_VALUE;
            for (Integer index : indexList) {
                speedSum += speed[index];
                efficiencyMin = Math.min(efficiencyMin, efficiency[index]);
            }
            long performance = (speedSum * efficiencyMin) % (long) (10E9 + 7);
            ans = (int) Math.max(ans, performance);
        }
        return ans;
    }

    public List<List<Integer>> getCombinationResult(int k, List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        if (k == 1) {
            for (int i : list) {
                List<Integer> list1 = new ArrayList<>();
                list1.add(i);
                result.add(list1);
            }
            return result;
        }
        if (k >= list.size()) {
            result.add(list);
            return result;
        }
        for (int i = 0; i < (list.size() - k + 1); i++) {
            List<List<Integer>> lists = getCombinationResult(k - 1, list.subList(i + 1, list.size()));//从i+1处直至字符串末尾
            int val = list.get(i);
            for (List<Integer> list1 : lists) {
                list1.add(val);
                result.add(list1);
            }
        }
        return result;
    }
}

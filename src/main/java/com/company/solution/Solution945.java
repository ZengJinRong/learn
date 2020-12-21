package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 945. 使数组唯一的最小增量
 */
public class Solution945 {
    public int minIncrementForUnique(int[] A) {
        int[] count = new int[80000];
        for (int x : A) {
            count[x]++;
        }
        int ans = 0, taken = 0;
        for (int x = 0; x < 80000; ++x) {
            if (count[x] >= 2) {
                taken += count[x] - 1;
                ans -= x * (count[x] - 1);
            } else if (taken > 0 && count[x] == 0) {
                taken--;
                ans += x;
            }
        }
        return ans;
    }

    /**
     * FIXME:超出时间限制
     */
    public int minIncrementForUnique2(int[] A) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            while (set.contains(num)) {
                num++;
                ans++;
            }
            set.add(num);
        }
        return ans;
    }
}

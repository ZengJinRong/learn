package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 5353. 灯泡开关 III
 */
public class Solution5353 {
    public int numTimesAllBlue(int[] light) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int max = 0;
        for (int index : light) {
            if (index > max) {
                for (int j = max + 1; j < index; j++) {
                    set.add(j);
                }
                max = index;
            } else {
                set.remove(index);
            }
            if (set.isEmpty()) {
                ans++;
            }
        }
        return ans;
    }
}

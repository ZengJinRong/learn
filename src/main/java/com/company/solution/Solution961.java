package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 961. 重复 N 次的元素
 */
public class Solution961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                return i;
            } else {
                set.add(i);
            }
        }
        return -1;
    }

    // TODO: 2020/2/13 其他解法

}

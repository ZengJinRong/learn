package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 136. 只出现一次的数字
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return (int) set.toArray()[0];
    }
}

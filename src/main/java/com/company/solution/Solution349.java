package com.company.solution;

import java.util.*;

/**
 * 349. 两个数组的交集
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                ans.add(i);
            }
        }
        return Arrays.stream(ans.toArray())
                .mapToInt(x -> (int) x)
                .toArray();
    }

    public int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        return Arrays.stream(set1.toArray())
                .mapToInt(x -> (int) x)
                .toArray();
    }
}

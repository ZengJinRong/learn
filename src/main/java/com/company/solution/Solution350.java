package com.company.solution;

import java.util.*;

/**
 * 350. 两个数组的交集 II
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, count);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                int count = map.get(num) - 1;
                if (count == 0) {
                    map.remove(num);
                } else {
                    map.put(num, count);
                }
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] intersect3(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect3(nums2, nums1);
        }
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : nums1) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        int k = 0;
        for (int n : nums2) {
            int cnt = m.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                m.put(n, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}

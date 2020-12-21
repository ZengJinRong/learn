package com.company.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 1207. 独一无二的出现次数
 */
public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        //统计各数字出现的次数
        int[] counts = new int[2001];
        for (int num : arr) {
            counts[num + 1000]++;
        }

        //判断数字出现的次数是否重复
        boolean[] countExist = new boolean[1001];
        for (int count : counts) {
            if (count == 0) {
                continue;
            }
            if (countExist[count]) {
                return false;
            } else {
                countExist[count] = true;
            }
        }
        return true;
    }

    public boolean uniqueOccurrences3(int[] arr) {
        int[] bucket = new int[2001];
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            bucket[i + 1000]++;
        }
        for (int count : bucket) {
            if (count == 0) {
                continue;
            }
            if (set.contains(count)) {
                return false;
            } else {
                set.add(count);
            }
        }
        return true;
    }
}

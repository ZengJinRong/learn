package com.company.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 5323. 根据数字二进制下 1 的数目排序
 */
public class Solution5323 {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(
                        Comparator.comparingInt(this::valByBits)
                                .thenComparing(Integer::intValue)
                )
                .mapToInt(x -> x)
                .toArray();
    }

    private int valByBits(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        return count;
    }
}

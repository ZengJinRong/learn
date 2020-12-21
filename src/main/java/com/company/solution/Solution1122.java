package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 1122. 数组的相对排序
 */
public class Solution1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] counts = new int[1001];
        for (int num : arr1) {
            counts[num]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            while (counts[num] > 0) {
                result[index] = num;
                index++;
                counts[num]--;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}

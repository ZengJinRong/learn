package com.company.solution;

/**
 * 5368. 找出数组中的幸运数
 */
public class Solution5368 {
    public int findLucky(int[] arr) {
        int[] count = new int[500];
        for (int num : arr) {
            count[num - 1]++;
        }
        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] == i + 1) {
                return i + 1;
            }
        }
        return -1;
    }
}

package com.company.solution;

/**
 * 5312. 大小为 K 且平均值大于等于阈值的子数组数目
 */
public class Solution5312 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int x = k * threshold;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if (sum >= x) {
                count++;
            }
        }
        return count;
    }
}

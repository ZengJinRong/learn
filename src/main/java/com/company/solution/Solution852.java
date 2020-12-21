package com.company.solution;

/**
 * 852. 山脉数组的峰顶索引
 */
public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (A[middle] < A[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public int peakIndexInMountainArray2(int[] A) {
        int i = 0;
        while (A[i] < A[i + 1]) {
            i++;
        }
        return i;
    }
}

package com.company.solution;

import com.sun.org.apache.bcel.internal.generic.I2B;

/**
 * 88. 合并两个有序数组
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = 0;
        for (int i2 = 0; i2 < n; i1++) {
            if (nums2[i2] < nums1[i1] || i1 - i2 == m) {
                System.arraycopy(nums1, i1, nums1, i1 + 1, m - i1 + i2);
                nums1[i1] = nums2[i2];
                i2++;
            }
        }
    }
}

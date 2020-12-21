package com.company.offer;

import java.util.Arrays;

/**
 * 面试题53 - II. 0～n-1中缺失的数字
 */
public class Offer53B {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] == middle) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[left] == left ? left + 1 : left;    //若所有数字的顺序都正确，则缺的数字为 n-1
    }

    public int missingNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}

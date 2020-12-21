package com.company.offer;

import java.util.logging.Level;

/**
 * 面试题53 - I. 在排序数组中查找数字 I
 */
public class Offer53A {
    public int search(int[] nums, int target) {
        int minIndex = getMinIndex(nums, target, 0, nums.length);
        if (minIndex == nums.length || nums[minIndex] != target) {
            return 0;
        }
        int maxIndex = getMaxIndex(nums, target, minIndex, nums.length);
        return maxIndex - minIndex + 1;
    }

    private int getMinIndex(int[] nums, int target, int left, int right) {
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] >= target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private int getMaxIndex(int[] nums, int target, int left, int right) {
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return right - 1;
    }
}

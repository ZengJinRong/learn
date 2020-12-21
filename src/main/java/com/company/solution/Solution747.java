package com.company.solution;

/**
 * 747. 至少是其他数字两倍的最大数
 */
public class Solution747 {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int max = 0;
        int secondLargest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondLargest = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest * 2 <= max ? maxIndex : -1;
    }
}

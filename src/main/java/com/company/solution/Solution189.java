package com.company.solution;

import java.util.Arrays;

/**
 * 189. 旋转数组
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (; k > 0; k--) {
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int num = nums[i];
                nums[i] = temp;
                temp = num;
            }
            nums[0] = temp;
        }
    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, nums.length - k - 1 + 1);
        System.arraycopy(temp, 0, nums, 0, k);
    }

    /**
     * TODO:理解解题思路
     */
    public void rotate3(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}

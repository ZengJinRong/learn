package com.company.solution;

/**
 * 169. 多数元素
 */
public class Solution169 {

    /**
     * 投票算法
     */
    public int majorityElement(int[] nums) {
        int count = 1;
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else if (count == 0) {
                val = nums[i];
                count++;
            } else {
                count--;
            }
        }
        return val;
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}

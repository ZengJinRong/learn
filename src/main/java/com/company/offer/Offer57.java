package com.company.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题57. 和为s的两个数字
 */
public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return new int[]{num, target - num};
            } else {
                set.add(target - num);
            }
        }
        return null;
    }
}

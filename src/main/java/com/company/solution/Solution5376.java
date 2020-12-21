package com.company.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5376. 非递增顺序的最小子序列
 */
public class Solution5376 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            temp += nums[i];
            if (temp * 2 > sum && list.size() > 0) {
                break;
            } else {
                list.add(nums[i]);
            }
        }
        return list;
    }
}

package com.company.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 5344. 有多少小于当前数字的数字
 */
public class Solution5244 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortedNums.length; i++) {
            int sortedNum = sortedNums[i];
            if (!map.containsKey(sortedNum)) {
                map.put(sortedNum, i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}

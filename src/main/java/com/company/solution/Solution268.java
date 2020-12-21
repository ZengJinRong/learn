package com.company.solution;

/**
 * 268. 缺失数字
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int i = 1; i <= nums.length; i++) {
            ans += i;
        }
        for (int num : nums) {
            ans -= num;
        }
        return ans;
    }

    /**
     * 解法1改进
     */
    public int missingNumber2(int[] nums) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans += i;
            ans -= nums[i];
        }
        return ans;
    }

    /**
     * 位运算
     * TODO:理解解题原理
     */
    public int missingNumber3(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}

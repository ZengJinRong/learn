package com.company.solution;

import java.util.Arrays;

/**
 * 1295. 统计位数为偶数的数字
 */
public class Solution1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int findNumbers1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            String str = String.valueOf(num);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int findNumbers2(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            count += 1 - str.length() % 2;
        }
        return count;
    }

    public int findNumbers3(int[] nums) {
        return Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .mapToInt(str -> 1 - str.length() % 2)
                .sum();
    }

    public int findNumbers4(int[] nums) {
        return (int) Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .mapToInt(String::length)
                .filter(len -> len % 2 == 0)
                .count();
    }

    /**
     * TODO:解题原理
     */
    public int findNumbers5(int[] nums) {
        int count = 0;
        for (int num : nums) {
            count += 1 - (Math.log(num)/Math.log(10) + 1) % 2;
        }
        return count;
    }
}

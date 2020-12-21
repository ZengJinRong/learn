package com.company.Interview;

/**
 * 面试题 17.10. 主要元素
 * TODO:理解解题思路
 */
public class Interview1710 {
    public int majorityElement(int[] nums) {
        // 投票算法
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i];
                count = 1;
            }
        }

        // 验证是否满足要求
        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == temp) {
                count++;
            }
            if (count == t) {
                return temp;
            }
        }
        return -1;
    }
}

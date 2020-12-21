package com.company.Interview;

/**
 * 面试题 08.03. 魔术索引
 */
public class Interview0803 {

    /**
     * TODO:理解解题思路
     */
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == i) {
                return i;
            } else if (nums[i] > i) {
                i = nums[i];
            } else {
                i++;
            }
        }
        return -1;
    }

    public int findMagicIndex2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
        }
        return -1;
    }
}

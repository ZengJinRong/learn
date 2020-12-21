package com.company.solution;

/**
 * 35. 搜索插入位置
 */
public class Solution35 {

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }

    /**
     * 二分法
     */
    public int searchInsert2(int[] nums, int target) {
        int length = nums.length;
        if (length == 1) {
            return nums[0] < target ? 1 : 0;
        }
        return searchInsert2(nums, target, 0, length - 1);
    }

    private int searchInsert2(int[] nums, int target, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex || nums[leftIndex] >= target) {
            return leftIndex;
        } else if (nums[rightIndex] < target) {
            return rightIndex + 1;
        }

        int middleIndex = (leftIndex + rightIndex) / 2;
        if (nums[middleIndex] < target) {
            return searchInsert2(nums, target, middleIndex + 1, rightIndex);
        } else if (nums[middleIndex] > target) {
            return searchInsert2(nums, target, leftIndex, middleIndex);
        } else {
            return middleIndex;
        }
    }


    /**
     * 二分法
     */
    public int searchInsert3(int[] nums, int target) {
        int length = nums.length;
        int leftIndex = 0;
        int rightIndex = length - 1;
        if (nums[rightIndex] < target) {
            return length;
        }
        while (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) >>> 1;
            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex;
            }
        }
        return leftIndex;
    }

    /**
     * 二分法
     */
    public int searchInsert4(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) >>> 1;
            if (nums[middleIndex] == target) {
                return middleIndex;
            } else if (nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
        return leftIndex;
    }
}

package com.company.solution;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class Solution34 {
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    /**
     * TODO:理解解题思路
     */
    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};
        int leftIdx = extremeInsertionIndex(nums, target, true);
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }
        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false) - 1;
        return targetRange;
    }

    public int[] searchRange2(int[] nums, int target) {
        int minIndex = getMinIndex(nums, target, 0, nums.length);
        if (minIndex == nums.length || nums[minIndex] != target) {
            return new int[]{-1, -1};
        }
        int maxIndex = getMaxIndex(nums, target, minIndex, nums.length);
        return new int[]{minIndex,maxIndex};
    }


    private int getMinIndex(int[] nums, int target, int left, int right) {
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] >= target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private int getMaxIndex(int[] nums, int target, int left, int right) {
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return right - 1;
    }

    /**
     * FIXME:超出时间限制
     */
    public int[] searchRange3(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (nums[middle] != target) {
            middle = (left + right) / 2;
            if (middle < target) {
                left = middle + 1;
            } else if (middle > target) {
                right = middle;
            }
            if (left > right) {
                return new int[]{-1, -1};
            }
        }

        int start = middle;
        while (start - 1 >= 0 && nums[start - 1] == target) {
            start--;
        }
        int end = middle;
        while (end + 1 < nums.length && nums[end + 1] == target) {
            end++;
        }
        return new int[]{start, end};
    }
}

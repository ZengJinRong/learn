package com.company.solution;

import java.util.HashMap;
import java.util.Stack;

/**
 * 496. 下一个更大元素 I
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            nums1[i] = -1;
            int j = 0;
            while (nums2[j] != val) {
                j++;
            }
            for (int k = j; k < nums2.length; k++) {
                if (nums2[k] > val) {
                    nums1[i] = nums2[k];
                    break;
                }
            }
        }
        return nums1;
    }

    /**
     * TODO:理解解题思路
     */
    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        Stack< Integer > stack = new Stack < > ();
        HashMap< Integer, Integer > map = new HashMap < > ();
        int[] res = new int[findNums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!stack.empty() && nums[i] > stack.peek())
                map.put(stack.pop(), nums[i]);
            stack.push(nums[i]);
        }
        while (!stack.empty())
            map.put(stack.pop(), -1);
        for (int i = 0; i < findNums.length; i++) {
            res[i] = map.get(findNums[i]);
        }
        return res;
    }
}

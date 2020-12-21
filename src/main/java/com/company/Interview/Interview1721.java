package com.company.Interview;

/**
 * 面试题 17.21. 直方图的水量
 */
public class Interview1721 {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightmax = height[right];
        int res = 0;
        while (left < right) {
            if (leftMax < rightmax) {
                res += leftMax - height[left++];
                leftMax = Math.max(height[left], leftMax);
            } else {
                res += rightmax - height[right--];
                rightmax = Math.max(height[right], rightmax);
            }
        }
        return res;
    }
}

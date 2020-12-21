package com.company.solution;

/**
 * 5348. 两个数组间的距离值
 */
public class Solution5348 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int i1 : arr1) {
            for (int i2 : arr2) {
                if (Math.abs(i1 - i2) <= d) {
                    ans++;
                    break;
                }
            }
        }
        return arr1.length - ans;
    }
}

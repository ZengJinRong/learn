package com.company.solution;

/**
 * 1299. 将每个元素替换为右侧最大元素
 */
public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int max = arr[length - 1];
        arr[length - 1] = -1;
        for (int i = length - 2; i >= 0; i--) {
            int val = arr[i];
            arr[i] = max;
            if (val > max) {
                max = val;
            }
        }
        return arr;
    }
}

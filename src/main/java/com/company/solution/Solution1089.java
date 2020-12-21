package com.company.solution;

/**
 * 1089. 复写零
 * TODO:其他解法
 */
public class Solution1089 {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                i++;
                System.arraycopy(arr, i, arr, i + 1, arr.length - i - 1);
                arr[i] = 0;
            }
        }
    }
}

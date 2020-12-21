package com.company.solution;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 */
public class Solution977 {
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int[] B = new int[A.length];
        for (int i = A.length - 1; left <= right; i--) {
            int leftVal = A[left] * A[left];
            int rightVal = A[right] * A[right];
            if (leftVal <= rightVal) {
                B[i] = rightVal;
                right--;
            } else {
                B[i] = leftVal;
                left++;
            }
        }
        return B;
    }

    public int[] sortedSquares2(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public int[] sortedSquares3(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int[] temp = new int[A.length];
        int currentIndex = right;
        while (left <= right) {
            if (Math.abs(A[left]) <= Math.abs(A[right])) {
                temp[currentIndex--] = (int) Math.pow(A[right], 2);
                right--;
            } else {
                temp[currentIndex--] = (int) Math.pow(A[left], 2);
                left++;
            }
        }
        return temp;
    }
}

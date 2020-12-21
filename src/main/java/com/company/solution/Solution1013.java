package com.company.solution;

import java.util.Arrays;

/**
 * 1013. 将数组分成和相等的三个部分
 * TODO:注意细节
 */
public class Solution1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int sum = Arrays.stream(A).sum();
        if (sum % 3 != 0) {
            return false;
        }
        int s = sum / 3;
        int i = 0;
        int s1 = A[0];
        while (i < A.length - 1 && s1 != s) {
            i++;
            s1 += A[i];
        }
        int j = A.length - 1;
        int s3 = A[j];
        while (j > i + 1 && s3 != s) {
            j--;
            if (j <= i + 1) {
                return false;
            }
            s3 += A[j];
        }
        return s3 == s;
    }

    public boolean canThreePartsEqualSum2(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) {
            // 总和不是3的倍数，直接返回false
            return false;
        }

        // 使用双指针,从数组两头开始一起找，节约时间
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];

        // 使用left + 1 < right 的原因，防止只能将数组分成两个部分
        // 例如：[1,-1,1,-1]，使用left < right作为判断条件就会出错
        while (left + 1 < right) {
            if (leftSum == sum / 3 && rightSum == sum / 3) {
                // 左右两边都等于 sum/3 ，中间也一定等于
                return true;
            }
            if (leftSum != sum / 3) {
                // left = 0赋予了初值，应该先left++，在leftSum += A[left];
                leftSum += A[++left];
            }
            if (rightSum != sum / 3) {
                // right = A.length - 1 赋予了初值，应该先right--，在rightSum += A[right];
                rightSum += A[--right];
            }
        }
        return false;
    }
}

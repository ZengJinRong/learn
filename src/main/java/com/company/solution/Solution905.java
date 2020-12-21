package com.company.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 905. 按奇偶排序数组
 */
public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i : A) {
            if ((i & 1) == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        evenList.addAll(oddList);
        return Arrays.stream(evenList.toArray())
                .mapToInt(x -> (int) x)
                .toArray();
    }

    public int[] sortArrayByParity2(int[] A) {
        return Arrays.stream(A)
                .boxed()
                .sorted(Comparator.comparingInt(a -> a % 2))
                .mapToInt(i -> i)
                .toArray();
    }

    public int[] sortArrayByParity3(int[] A) {
        int length = A.length;
        int left = 0;
        int right = length - 1;
        int[] ans = new int[length];
        for (int val : A) {
            if ((val & 1) == 0) {
                ans[left] = val;
                left++;
            } else {
                ans[right] = val;
                right--;
            }
        }
        return ans;
    }

    public int[] sortArrayByParity4(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 > A[right] % 2) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }

            if (A[left] % 2 == 0) {
                left++;
            }
            if (A[right] % 2 == 1) {
                right--;
            }
        }

        return A;
    }
}

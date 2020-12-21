package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 922. 按奇偶排序数组 II
 */
public class Solution922 {
    public int[] sortArrayByParityII(int[] A) {
        int[] even = new int[A.length / 2];
        int[] odd = new int[A.length / 2];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i : A) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        evenIndex = 0;
        oddIndex = 0;
        int[] ans = new int[A.length];
        for (int i = 0; i < ans.length; i += 2) {
            ans[i] = even[evenIndex];
            evenIndex++;
            ans[i + 1] = odd[oddIndex];
            oddIndex++;
        }
        return ans;
    }

    // TODO: 2020/2/4 其他解法
}

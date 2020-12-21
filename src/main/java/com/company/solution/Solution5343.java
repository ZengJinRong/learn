package com.company.solution;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 5343. 多次求和构造目标数组
 */
public class Solution5343 {
    public boolean isPossible(int[] target) {
        int maxIndex = target.length - 1;
        Arrays.sort(target);
        int perSumExceptNow = 0;
        for (int i = 0; i < target.length - 1; i++) {
            perSumExceptNow += target[i];
        }

        while (target[maxIndex] != 1) {
            int preSum = target[maxIndex];
            if (preSum <= perSumExceptNow) {
                return false;
            }
            int val = preSum;
            while (val > perSumExceptNow) {
                val -= perSumExceptNow;
            }
            target[maxIndex] = val;
            Arrays.sort(target);
            perSumExceptNow = perSumExceptNow + val - target[maxIndex];
        }
        return true;
    }

    /**
     * FIXME:超出时间限制
     */
    public boolean isPossible2(int[] target) {
        int maxIndex = target.length - 1;
        Arrays.sort(target);
        while (target[maxIndex] != 1) {
            int preSun = target[maxIndex];
            int perSumExceptNow = 0;
            for (int i = 0; i < target.length - 1; i++) {
                perSumExceptNow += target[i];
            }
            if (preSun <= perSumExceptNow) {
                return false;
            }
            target[maxIndex] = preSun - perSumExceptNow;
            Arrays.sort(target);
        }
        return true;
    }


    /**
     * FIXME：某些场合不适用
     */
    public boolean isPossible3(int[] target) {
        int[] temp = new int[target.length];
        Arrays.fill(temp, 1);
        Arrays.sort(target);
        int sum = target.length;
        if (target[0] != sum) {
            return false;
        }
        for (int i = 1; i < target.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < temp.length; j++) {
                if (sum + sum - temp[j] == target[i]) {
                    temp[j] = sum;
                    sum = target[i];
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return false;
            }
        }
        return true;
    }
}


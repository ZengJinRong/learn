package com.company.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. 两数之和 II - 输入有序数组
 */
public class Solution167 {

    public int[] twoSum3(int[] numbers, int target) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int firstNum = numbers[i];
            for (int j = i + 1; j < length; j++) {
                if (firstNum + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    /**
     * 哈希表
     */
    public int[] twoSum4(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            map.put(numbers[i], i + 1);
        }
        for (int i = 0; i < length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i + 1, map.get(complement)};
            }
        }
        return null;
    }

    /**
     * 双指针
     */
    public int[] twoSum5(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }

}

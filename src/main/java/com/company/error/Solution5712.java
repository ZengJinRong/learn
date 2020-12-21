package com.company.error;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 5172. 形成三的最大倍数
 */
public class Solution5712 {
    public String largestMultipleOfThree(int[] digits) {
        List<Integer> list = Arrays.stream(digits).boxed()
                .sorted(Comparator.comparingInt(x -> x == 0 ? Integer.MAX_VALUE : x))
                .collect(Collectors.toList());

        int[] sums = getSums(list);
        int sum = sums[0];
        while (sum != 3 && sum != 6 && sum != 9) {
            if (list.size() == 0) {
                return "";
            }
            if (sum == 0) {
                return "0";
            }

            boolean removed = false;
            int[] gaps = getGaps(sum, new int[]{3, 6, 9});
            for (int gap : gaps) {
                removed = list.remove(new Integer(gap));
            }
            if (!removed) {
                gaps = getGaps(sums[1], new int[]{3, 6, 9, 12, 21, 15, 51, 24, 42, 33, 18, 81, 27, 72, 36, 63, 45, 54});
                for (int gap : gaps) {
                    removed = list.remove(new Integer(gap));
                }
            }
            if (!removed) {
                return "";
            }
            sums = getSums(list);
            sum = sums[0];
        }

        if (list.size() == 0) {
            return "";
        }
        list.sort(Comparator.comparingInt(Integer::intValue));
        StringBuilder stringBuilder = new StringBuilder(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
    }

    private int[] getGaps(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value - array[i];
        }
        Arrays.sort(array);
        return array;
    }

    private int[] getSums(List<Integer> list) {
        int sum = list.stream().mapToInt(x -> x).sum();
        int preSum = 0;
        while (sum >= 10) {
            int temp = 0;
            for (int i = sum; i > 0; i /= 10) {
                temp += i % 10;
            }
            preSum = sum;
            sum = temp;
        }
        return new int[]{sum, preSum};
    }
}

package com.company.Interview;

/**
 * 面试题 16.10. 生存人数
 */
public class Interview1610 {
    public int maxAliveYear(int[] birth, int[] death) {
        int[] increase = new int[102];
        for (int i : birth) {
            increase[i - 1900]++;
        }
        for (int i : death) {
            increase[i - 1899]--;
        }

        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < increase.length; i++) {
            sum += increase[i];
            if (sum > max) {
                max = sum;
                maxIndex = i;
            }
        }
        return maxIndex + 1900;
    }
}

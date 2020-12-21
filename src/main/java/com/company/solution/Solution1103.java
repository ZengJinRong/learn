package com.company.solution;

/**
 * 1103. 分糖果 II
 * TODO:数学解法
 */
public class Solution1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] counts = new int[num_people];
        int num = 1;
        while (candies > 0) {
            for (int i = 0; i < counts.length; i++) {
                if (candies <= num) {
                    counts[i] += candies;
                    return counts;
                }
                candies -= num;
                counts[i] += num;
                num++;
            }
        }
        return counts;
    }
}

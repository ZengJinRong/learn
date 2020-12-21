package com.company.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5356. 矩阵中的幸运数
 */
public class Solution5356 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int yMax = matrix.length;
        int xMAx = matrix[0].length;
        int[] colMax = new int[xMAx];
        Arrays.fill(colMax, Integer.MIN_VALUE);
        int[] rowMin = new int[yMax];
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        for (int y = 0; y < yMax; y++) {
            for (int x = 0; x < xMAx; x++) {
                int val = matrix[y][x];
                if (val > colMax[x]) {
                    colMax[x] = val;
                }
                if (val < rowMin[y]) {
                    rowMin[y] = val;
                }
            }
        }

        for (int y = 0; y < yMax; y++) {
            for (int x = 0; x < xMAx; x++) {
                int val = matrix[y][x];
                if (val == colMax[x] && val == rowMin[y]) {
                    list.add(val);
                }
            }
        }
        return list;
    }

}

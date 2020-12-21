package com.company.solution;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 883. 三维形体投影面积
 */
public class Solution883 {
    public int projectionArea(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        //FIXME:根据题意，x=y=N，可进一步改进

        int xyS = x * y;
        int xzS = 0;
        for (int[] ints : grid) {
            int max = 0;
            for (int i : ints) {
                if (i == 0) {
                    xyS--;
                } else if (i > max) {
                    max = i;
                }
            }
            xzS += max;
        }

        int yzS = 0;
        for (int i = 0; i < y; i++) {
            int max = 0;
            for (int[] ints : grid) {
                if (ints[i] > max) {
                    max = ints[i];
                }
            }
            yzS += max;
        }
        return xyS + xzS + yzS;
    }

    public int projectionArea2(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N;  ++i) {
            int bestRow = 0;  // largest of grid[i][j]
            int bestCol = 0;  // largest of grid[j][i]
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] > 0) {
                    ans++;  // top shadow
                }
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }

        return ans;
    }

}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5152Test {
    private static Solution5152 solution5152 = new Solution5152();

    @Test
    void diagonalSort() {
        int[][] mat = new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        for (int[] row : mat) {
            for (int i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        int[][] ans = solution5152.diagonalSort(mat);
        for (int[] row : ans) {
            for (int i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

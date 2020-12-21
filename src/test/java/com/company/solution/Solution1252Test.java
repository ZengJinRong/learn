package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1252Test {
    private static Solution1252 solution1252 = new Solution1252();

    @Test
    void oddCells() {
        int[][] indices = new int[2][2];
        indices[0] = new int[]{0, 1};
        indices[1] = new int[]{1, 1};
        int ans = solution1252.oddCells(2, 3, indices);
        assertEquals(6,ans);
    }
}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1217Test {
    private static Solution1217 solution1217 = new Solution1217();

    @Test
    void minCostToMoveChips() {
        assertEquals(1, solution1217.minCostToMoveChips(new int[]{1, 2, 2, 2, 2}));
        assertEquals(1, solution1217.minCostToMoveChips(new int[]{1, 2, 3}));
        assertEquals(2, solution1217.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
    }
}

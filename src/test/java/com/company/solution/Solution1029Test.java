package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1029Test {
    private static Solution1029 solution1029 = new Solution1029();

    @Test
    void twoCitySchedCost() {
        assertEquals(110, solution1029.twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
    }
}

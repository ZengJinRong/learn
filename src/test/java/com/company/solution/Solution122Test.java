package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution122Test {
    private static Solution122 solution122 = new Solution122();
    @Test
    void maxProfit() {
        assertEquals(0, solution122.maxProfit(new int[]{}));
        assertEquals(4, solution122.maxProfit(new int[]{1,2,3,4,5}));
        assertEquals(7, solution122.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}

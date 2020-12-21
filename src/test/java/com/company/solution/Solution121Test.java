package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution121Test {
    private static Solution121 solution121 = new Solution121();

    @Test
    void maxProfit() {
        assertEquals(5, solution121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution121.maxProfit(new int[]{7,6,4,3,1}));
    }
}

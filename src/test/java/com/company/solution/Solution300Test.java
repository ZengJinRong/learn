package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution300Test {
    private Solution300 solution300 = new Solution300();

    @Test
    void lengthOfLIS() {
        assertEquals(4, solution300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(1, solution300.lengthOfLIS(new int[]{0}));
        assertEquals(1, solution300.lengthOfLIS(new int[]{2,2}));
    }
}

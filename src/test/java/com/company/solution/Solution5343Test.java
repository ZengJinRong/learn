package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5343Test {
    private static Solution5343 solution5343 = new Solution5343();

    @Test
    void isPossible() {
        assertTrue(solution5343.isPossible(new int[]{9, 3, 5}));
        assertFalse(solution5343.isPossible(new int[]{1, 1, 1, 2}));
        assertTrue(solution5343.isPossible(new int[]{8, 5}));
    }
}

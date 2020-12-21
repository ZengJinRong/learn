package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution724Test {
    public static Solution724 solution724 = new Solution724();

    @Test
    void pivotIndex() {
        assertEquals(3, solution724.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        assertEquals(2, solution724.pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        assertEquals(1, solution724.pivotIndex(new int[]{-1, -1, -1, -1, 0, 1}));
        assertEquals(1, solution724.pivotIndex(new int[]{-1, -1, -1, -1, 1, 0}));
    }
}

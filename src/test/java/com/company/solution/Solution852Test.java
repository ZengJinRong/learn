package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution852Test {
    private static Solution852 solution852 = new Solution852();

    @Test
    void peakIndexInMountainArray() {
        assertEquals(4, solution852.peakIndexInMountainArray(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        assertEquals(4, solution852.peakIndexInMountainArray(new int[]{1, 3, 4, 6, 9, 2, 1, 0}));
        assertEquals(5, solution852.peakIndexInMountainArray(new int[]{1, 2, 3, 5, 7, 8, 4, 3, 2, 1}));
        assertEquals(2, solution852.peakIndexInMountainArray(new int[]{1, 4, 7, 5, 3, 4, 2, 1}));
    }
}

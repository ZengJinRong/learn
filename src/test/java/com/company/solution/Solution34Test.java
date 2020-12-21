package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    private static Solution34 solution34 = new Solution34();

    @Test
    void searchRange() {
        assertArrayEquals(new int[]{3, 4}, solution34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, solution34.searchRange(new int[0], 0));
        assertArrayEquals(new int[]{0, 0}, solution34.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{-1, -1}, solution34.searchRange(new int[]{0}, 1));
    }
}

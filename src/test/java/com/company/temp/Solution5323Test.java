package com.company.temp;

import com.company.solution.Solution5323;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5323Test {
    private static Solution5323 solution5323 = new Solution5323();

    @Test
    void sortByBits() {
        int[] ans = solution5323.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        assertArrayEquals(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7}, ans);
    }
}


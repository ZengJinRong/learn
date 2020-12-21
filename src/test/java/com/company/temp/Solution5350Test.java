package com.company.temp;

import com.company.solution.Solution5350;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5350Test {
    private Solution5350 solution5350 = new Solution5350();

    @Test
    void getKth() {
        assertEquals(13, solution5350.getKth(12, 15, 2));
        assertEquals(1, solution5350.getKth(1, 1, 1));
        assertEquals(7, solution5350.getKth(7, 11, 4));
        assertEquals(13, solution5350.getKth(10, 20, 5));
        assertEquals(570, solution5350.getKth(1, 1000, 777));
    }
}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5313Test {
    private static Solution5313 solution5313 = new Solution5313();

    @Test
    void angleClock() {
        assertEquals(165, solution5313.angleClock(12, 30));
        assertEquals(75, solution5313.angleClock(3, 30));
    }
}

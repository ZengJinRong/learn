package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {
    private static Solution7 solution7 = new Solution7();

    @Test
    void reverse() {
        assertEquals(1, solution7.reverse(10));
        assertEquals(321, solution7.reverse(123));
        assertEquals(4321, solution7.reverse(1234));
    }

    @Test
    void reverse2() {
    }
}

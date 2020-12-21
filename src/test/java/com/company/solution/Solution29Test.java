package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    private static Solution29 solution29 = new Solution29();
    @Test
    void divide() {
        assertEquals(5,solution29.divide(27,5));
        assertEquals(-13,solution29.divide(-40,3));
        assertEquals(0,solution29.divide(Integer.MAX_VALUE,Integer.MIN_VALUE));
        assertEquals(-1,solution29.divide(Integer.MIN_VALUE,Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE,solution29.divide(Integer.MIN_VALUE,-1));
        assertEquals(1,solution29.divide(1,1));
    }
}

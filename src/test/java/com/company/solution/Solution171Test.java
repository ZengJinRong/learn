package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution171Test {
    private static Solution171 solution171 = new Solution171();

    @Test
    void titleToNumber() {
        assertEquals(1, solution171.titleToNumber("A"));
        assertEquals(28, solution171.titleToNumber("AB"));
        assertEquals(701, solution171.titleToNumber("ZY"));
    }
}

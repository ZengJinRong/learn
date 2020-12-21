package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution945Test {

    @Test
    void minIncrementForUnique() {
        Solution945 solution945 = new Solution945();
        assertEquals(1, solution945.minIncrementForUnique(new int[]{1, 2, 2}));
        assertEquals(6, solution945.minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7}));
    }
}

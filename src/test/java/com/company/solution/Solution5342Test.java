package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5342Test {
    private static Solution5342 solution5342 = new Solution5342();

    @Test
    void maxEvents() {
        assertEquals(3, solution5342.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}}));
        assertEquals(4, solution5342.maxEvents(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}}));
    }
}

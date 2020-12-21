package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution914Test {

    @Test
    void hasGroupsSizeX() {
        Solution914 solution914 = new Solution914();
        assertTrue(solution914.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        assertFalse(solution914.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        assertFalse(solution914.hasGroupsSizeX(new int[]{1}));
        assertTrue(solution914.hasGroupsSizeX(new int[]{1, 1}));
    }
}

package com.company.temp;

import com.company.solution.Solution5366;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5366Test {

    @Test
    void hasValidPath() {
        assertTrue(new Solution5366().hasValidPath(new int[][]{{2, 4, 3}, {6, 5, 2}}));
        assertFalse(new Solution5366().hasValidPath(new int[][]{{1, 2, 1}, {1, 2, 1}}));
        assertFalse(new Solution5366().hasValidPath(new int[][]{{1, 1, 2}}));
        assertTrue(new Solution5366().hasValidPath(new int[][]{{1, 1, 1, 1, 1, 1, 3}}));
        assertTrue(new Solution5366().hasValidPath(new int[][]{{2}, {2}, {2}, {2}, {2}, {2}, {6}}));
        assertTrue(new Solution5366().hasValidPath(new int[][]{{4, 1}, {6, 1}}));
        assertTrue(new Solution5366().hasValidPath(new int[][]{{6, 1, 3}, {4, 1, 5}}));
    }
}

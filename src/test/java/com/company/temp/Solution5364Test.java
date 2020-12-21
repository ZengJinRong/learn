package com.company.temp;

import com.company.solution.Solution5364;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5364Test {

    @Test
    void createTargetArray() {
        Solution5364 solution5364 = new Solution5364();
        assertArrayEquals(new int[]{0, 4, 1, 3, 2},
                solution5364.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));

        assertArrayEquals(new int[]{0, 1, 2, 3, 4},
                solution5364.createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0}));
    }
}

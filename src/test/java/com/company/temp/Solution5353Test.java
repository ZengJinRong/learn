package com.company.temp;

import com.company.solution.Solution5353;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5353Test {
    private Solution5353 solution5353 = new Solution5353();

    @Test
    void numTimesAllBlue() {
        assertEquals(3, solution5353.numTimesAllBlue(new int[]{2, 1, 3, 5, 4}));
        assertEquals(2, solution5353.numTimesAllBlue(new int[]{3, 2, 4, 1, 5}));
        assertEquals(1, solution5353.numTimesAllBlue(new int[]{4, 1, 2, 3}));
        assertEquals(3, solution5353.numTimesAllBlue(new int[]{2, 1, 4, 3, 6, 5}));
        assertEquals(6, solution5353.numTimesAllBlue(new int[]{1, 2, 3, 4, 5, 6}));
    }
}

package com.company.temp;

import com.company.solution.Solution5178;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5178Test {

    @Test
    void sumFourDivisors() {
        Solution5178 solution5178 = new Solution5178();
        assertEquals(32, solution5178.sumFourDivisors(new int[]{21, 4, 7}));
        assertEquals(64, solution5178.sumFourDivisors(new int[]{21, 21}));
    }
}

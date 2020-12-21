package com.company.temp;

import com.company.solution.Solution5175;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5175Test {
    private static Solution5175 solution5175 = new Solution5175();

    @Test
    void closestDivisors() {
        assertArrayEquals(new int[]{3,3},solution5175.closestDivisors(8));
        assertArrayEquals(new int[]{5,25},solution5175.closestDivisors(123));
        assertArrayEquals(new int[]{25,40},solution5175.closestDivisors(999));
    }
}

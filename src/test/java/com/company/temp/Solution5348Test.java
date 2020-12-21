package com.company.temp;

import com.company.solution.Solution5348;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5348Test {
    private static Solution5348 solution5348 = new Solution5348();

    @Test
    void findTheDistanceValue() {
        assertEquals(2, solution5348.findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        assertEquals(2, solution5348.findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
        assertEquals(1, solution5348.findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }
}

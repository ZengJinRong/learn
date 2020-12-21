package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5312Test {
    private static Solution5312 solution5312 = new Solution5312();

    @Test
    void numOfSubarrays() {
        assertEquals(3, solution5312.numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }
}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1013Test {
    private static Solution1013 solution1013 = new Solution1013();

    @Test
    void canThreePartsEqualSum() {
        assertTrue(solution1013.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        assertFalse(solution1013.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        assertTrue(solution1013.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
        assertTrue(solution1013.canThreePartsEqualSum(new int[]{18, 12, -18, 18, -19, -1, 10, 10}));
        assertTrue(solution1013.canThreePartsEqualSum(new int[]{15,20,-6,-17,-9,1,20,-1,13}));
        assertFalse(solution1013.canThreePartsEqualSum(new int[]{1,-1,1,-1}));
    }
}

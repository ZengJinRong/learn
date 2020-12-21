package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1089Test {
    private static Solution1089 solution1089 = new Solution1089();

    @Test
    void duplicateZeros() {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        solution1089.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);

        arr = new int[]{1, 2, 3};
        solution1089.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);

        arr = new int[]{0, 0, 0, 0, 0, 0, 0};
        solution1089.duplicateZeros(arr);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, arr);
    }
}

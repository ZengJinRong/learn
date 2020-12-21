package com.company.temp;

import com.company.solution.Solution5356;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5356Test {
    private static Solution5356 solution5356 = new Solution5356();

    @Test
    void luckyNumbers() {
        assertArrayEquals(new int[]{15}, solution5356.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}).stream().mapToInt(x -> x).toArray());
        assertArrayEquals(new int[]{12}, solution5356.luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}).stream().mapToInt(x -> x).toArray());
        assertArrayEquals(new int[]{7}, solution5356.luckyNumbers(new int[][]{{7, 8}, {1, 2}}).stream().mapToInt(x -> x).toArray());
    }
}

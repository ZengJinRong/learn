package com.company.solution;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution118Test {
    private static Solution118 solution118 = new Solution118();

    @Test
    void generate() {
        List<List<Integer>> resultList = solution118.generate(5);
        assertArrayEquals(new Integer[]{1}, resultList.get(0).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,1}, resultList.get(1).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,2,1}, resultList.get(2).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,3,3,1}, resultList.get(3).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,4,6,4,1}, resultList.get(4).toArray(new Integer[]{}));
    }
}

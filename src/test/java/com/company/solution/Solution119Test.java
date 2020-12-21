package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution119Test {
    private static Solution119 solution119 = new Solution119();

    @Test
    void getRow() {
        assertArrayEquals(new Integer[]{1}, solution119.getRow(0).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,1}, solution119.getRow(1).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,2,1}, solution119.getRow(2).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,3,3,1}, solution119.getRow(3).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,4,6,4,1}, solution119.getRow(4).toArray(new Integer[]{}));
    }

    @Test
    void getRow2() {
        assertArrayEquals(new Integer[]{1}, solution119.getRow2(0).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,1}, solution119.getRow2(1).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,2,1}, solution119.getRow2(2).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,3,3,1}, solution119.getRow2(3).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{1,4,6,4,1}, solution119.getRow2(4).toArray(new Integer[]{}));
    }
}

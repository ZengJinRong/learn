package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution38Test {
    private static Solution38 solution38 = new Solution38();

    @Test
    void countAndSay() {
        assertEquals("1", solution38.countAndSay(1));
        assertEquals("11", solution38.countAndSay(2));
        assertEquals("21", solution38.countAndSay(3));
        assertEquals("1211", solution38.countAndSay(4));
        assertEquals("111221", solution38.countAndSay(5));
    }
}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {
    private static Solution8 solution8 = new Solution8();

    @Test
    void myAtoi() {
        assertEquals(0, solution8.myAtoi(""));
        assertEquals(0, solution8.myAtoi(" "));
        assertEquals(0, solution8.myAtoi("  asd"));
        assertEquals(0, solution8.myAtoi("a123"));
        assertEquals(123, solution8.myAtoi(" 123A"));
        assertEquals(123, solution8.myAtoi(" +123A"));
        assertEquals(-123, solution8.myAtoi("  -123A"));
        assertEquals(-2147483648, solution8.myAtoi("-91283472332"));
        assertEquals(2147483647, solution8.myAtoi("9223372036854775808"));
        assertEquals(4193, solution8.myAtoi("4193 with words"));
        assertEquals(12345678, solution8.myAtoi("  0000000000012345678"));
        assertEquals(0, solution8.myAtoi("    0000000000000   "));
    }
}

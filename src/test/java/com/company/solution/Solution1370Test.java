package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1370Test {
    private static Solution1370 solution1370 = new Solution1370();

    @Test
    void sortString() {
        assertEquals("abccbaabccba",solution1370.sortString("aaaabbbbcccc"));
        assertEquals("art",solution1370.sortString("rat"));
        assertEquals("cdelotee",solution1370.sortString("leetcode"));
    }
}

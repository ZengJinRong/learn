package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution893Test {
    private static Solution893 solution893 = new Solution893();

    @Test
    void numSpecialEquivGroups() {
        assertEquals(3, solution893.numSpecialEquivGroups(new String[]{"a", "b", "c", "a", "c", "c"}));
        assertEquals(4, solution893.numSpecialEquivGroups(new String[]{"aa", "bb", "ab", "ba"}));
        assertEquals(3, solution893.numSpecialEquivGroups(new String[]{"abc", "acb", "bac", "bca", "cab", "cba"}));
        assertEquals(1, solution893.numSpecialEquivGroups(new String[]{"abcd", "cdab", "adcb", "cbad"}));
        assertEquals(3, solution893.numSpecialEquivGroups(new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"}));
    }
}

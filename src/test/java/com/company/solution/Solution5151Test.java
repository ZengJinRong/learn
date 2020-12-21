package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5151Test {
    private static Solution5151 solution5151 = new Solution5151();
    @Test
    void breakPalindrome() {
        assertEquals("ab",solution5151.breakPalindrome("aa"));
        assertEquals("abb",solution5151.breakPalindrome("aba"));
    }
}

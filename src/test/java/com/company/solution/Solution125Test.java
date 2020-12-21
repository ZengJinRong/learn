package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution125Test {
    private static Solution125 solution125 = new Solution125();

    @Test
    void isPalindrome() {
        assertTrue(solution125.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution125.isPalindrome("race a car"));
    }

}

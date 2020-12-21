package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution202Test {
    private static Solution202 solution202 = new Solution202();

    @Test
    void isHappy() {
        assertTrue(solution202.isHappy(19));
    }
}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution374Test {
    private static Solution374 solution374 = new Solution374();

    @Test
    void guessNumber() {
        guessNumber(1);
        guessNumber(10);
        guessNumber(2126753390);
    }

    void guessNumber(int n) {
        solution374.setExpected(n);
        assertEquals(n, solution374.guessNumber(n));

    }
}

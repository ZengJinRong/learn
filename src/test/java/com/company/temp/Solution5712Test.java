package com.company.temp;

import com.company.error.Solution5712;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5712Test {
    private static Solution5712 solution5712 = new Solution5712();

    @Test
    void largestMultipleOfThree() {
        assertEquals("981", solution5712.largestMultipleOfThree(new int[]{8, 1, 9}));
        assertEquals("8760", solution5712.largestMultipleOfThree(new int[]{8, 6, 7, 1, 0}));
        assertEquals("", solution5712.largestMultipleOfThree(new int[]{1}));
        assertEquals("0", solution5712.largestMultipleOfThree(new int[]{0, 0, 0, 0, 0, 0}));
        assertEquals("111", solution5712.largestMultipleOfThree(new int[]{1, 1, 1, 2}));
        assertEquals("7770", solution5712.largestMultipleOfThree(new int[]{8, 7, 0, 7, 7}));
        assertEquals("966", solution5712.largestMultipleOfThree(new int[]{9, 8, 6, 8, 6}));
    }
}

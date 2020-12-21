package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5329Test {
    public static Solution5329 solution5329 = new Solution5329();

    @Test
    void minSetSize() {
        assertEquals(2, solution5329.minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
    }
}

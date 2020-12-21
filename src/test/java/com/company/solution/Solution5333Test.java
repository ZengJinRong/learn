package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5333Test {
    private static Solution5333 solution5333 = new Solution5333();

    @Test
    void minSteps() {
        assertEquals(4, solution5333.minSteps("friend", "family"));
        assertEquals(18, solution5333.minSteps("gctcxyuluxjuxnsvmomavutrrf", "qijrjrhqqjxjtprybrzpyfyqtzf"));
    }
}

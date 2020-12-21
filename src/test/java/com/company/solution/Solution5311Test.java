package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5311Test {
    private static Solution5311 solution5311 = new Solution5311();
    @Test
    void numberOfSteps() {
        int i = solution5311.numberOfSteps(10 ^ 6);
        System.out.println(i);
    }
}

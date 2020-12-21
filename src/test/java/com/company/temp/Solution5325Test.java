package com.company.temp;

import com.company.solution.Solution5325;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5325Test {
    private Solution5325 solution5325 = new Solution5325();

    @Test
    void numberOfSubstrings() {
        assertEquals(10, solution5325.numberOfSubstrings("abcabc"));
        assertEquals(3, solution5325.numberOfSubstrings("aaacb"));
        assertEquals(1, solution5325.numberOfSubstrings("abc"));
    }
}

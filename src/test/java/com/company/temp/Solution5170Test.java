package com.company.temp;

import com.company.solution.Solution5170;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5170Test {
    private static Solution5170 solution5170 = new Solution5170();

    @Test
    void validateBinaryTreeNodes() {
        assertTrue(solution5170.validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}));
        assertFalse(solution5170.validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}));
        assertFalse(solution5170.validateBinaryTreeNodes(2, new int[]{1, 0}, new int[]{-1, -1}));
        assertFalse(solution5170.validateBinaryTreeNodes(6, new int[]{1, -1, -1, 4, -1, -1}, new int[]{2, -1, -1, 5, -1, -1}));
    }
}

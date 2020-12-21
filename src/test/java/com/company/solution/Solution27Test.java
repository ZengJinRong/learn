package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    private static Solution27 solution27 = new Solution27();

    @Test
    void removeElement() {
        int[] nums = new int[]{};
        int len = solution27.removeElement(nums, 0);
        assertEquals(0, len);
        assertArrayEquals(new int[]{}, nums);

        nums = new int[]{3, 2, 2, 3};
        len = solution27.removeElement(nums, 3);
        assertEquals(2, len);
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        len = solution27.removeElement(nums, 2);
        assertEquals(5, len);
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(0, nums[3]);
        assertEquals(4, nums[4]);
    }
}

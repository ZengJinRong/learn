package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution189Test {
    private static Solution189 solution189 = new Solution189();

    @Test
    void rotate() {
    }

    @Test
    void rotate2() {
        int[] nums;

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution189.rotate2(nums, 1);
        assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution189.rotate2(nums, 2);
        assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, nums);

        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution189.rotate2(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);

        nums = new int[]{-1, -100, 3, 99};
        solution189.rotate2(nums, 1);
        assertArrayEquals(new int[]{99, -1, -100, 3}, nums);

        nums = new int[]{-1, -100, 3, 99};
        solution189.rotate2(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }
}

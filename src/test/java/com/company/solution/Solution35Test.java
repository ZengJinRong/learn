package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    private static Solution35 solution35 = new Solution35();

    @Test
    void searchInsert() {
        int index;
        int[] nums;

        nums = new int[]{1};
        index = solution35.searchInsert(nums, 2);
        assertEquals(1, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert(nums, 5);
        assertEquals(2, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert(nums, 2);
        assertEquals(1, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert(nums, 7);
        assertEquals(4, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert(nums, 0);
        assertEquals(0, index);
    }

    @Test
    void searchInsert2(){
        int index;
        int[] nums;

        nums = new int[]{1};
        index = solution35.searchInsert2(nums, 2);
        assertEquals(1, index);

        nums = new int[]{1,3};
        index = solution35.searchInsert2(nums, 3);
        assertEquals(1, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert2(nums, 5);
        assertEquals(2, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert2(nums, 2);
        assertEquals(1, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert2(nums, 7);
        assertEquals(4, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert2(nums, 0);
        assertEquals(0, index);
    }


    @Test
    void searchInsert3(){
        int index;
        int[] nums;

        nums = new int[]{1};
        index = solution35.searchInsert3(nums, 2);
        assertEquals(1, index);

        nums = new int[]{1,3};
        index = solution35.searchInsert3(nums, 3);
        assertEquals(1, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert3(nums, 5);
        assertEquals(2, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert3(nums, 2);
        assertEquals(1, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert3(nums, 7);
        assertEquals(4, index);

        nums = new int[]{1, 3, 5, 6};
        index = solution35.searchInsert3(nums, 0);
        assertEquals(0, index);
    }

}

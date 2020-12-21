package com.company.temp;

import com.company.solution.Solution5354;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5354Test {
    private Solution5354 solution5354 = new Solution5354();

    @Test
    void test() {
        assertEquals(0,  solution5354.numOfMinutes(1, 0, new int[]{-1}, new int[]{0}));
        assertEquals(1,  solution5354.numOfMinutes(1, 0, new int[]{2,2,-1,2,2,2}, new int[]{0,0,1,0,0,0}));
        assertEquals(21,  solution5354.numOfMinutes(1, 0, new int[]{1,2,3,4,5,6,-1}, new int[]{0,6,5,4,3,2,1}));
//        assertEquals(0, solution5354.numOfMinutes(1, 0, new int[]{-1}, new int[]{0}));
    }

}

package com.company.temp;

import com.company.solution.Solution5381;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5381Test {

    @Test
    void processQueries() {
        Solution5381 solution5381 = new Solution5381();
        assertArrayEquals(new int[]{2, 1, 2, 1}, solution5381.processQueries(new int[]{3, 1, 2, 1}, 5));
        assertArrayEquals(new int[]{3, 1, 2, 0}, solution5381.processQueries(new int[]{4, 1, 2, 2}, 4));
        assertArrayEquals(new int[]{6, 5, 0, 7, 5}, solution5381.processQueries(new int[]{7, 5, 5, 8, 3}, 8));
    }
}

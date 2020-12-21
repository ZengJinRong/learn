package com.company.temp;

import com.company.error.Solution5349;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5349Test {

    @Test
    void maxNumberOfFamilies() {
        Solution5349 solution5349 = new Solution5349();

        assertEquals(4, solution5349.maxNumberOfFamilies(3,
                new int[][]{{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}}
        ));


        assertEquals(2, solution5349.maxNumberOfFamilies(2,
                new int[][]{{2, 1}, {1, 8}, {2, 6}}
        ));


        assertEquals(4, solution5349.maxNumberOfFamilies(4,
                new int[][]{{4, 3}, {1, 4}, {4, 6}, {1, 7}}
        ));
    }
}

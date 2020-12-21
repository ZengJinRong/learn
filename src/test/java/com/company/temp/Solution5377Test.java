package com.company.temp;

import com.company.solution.Solution5377;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5377Test {

    @Test
    void numSteps() {
        Solution5377 solution5377 = new Solution5377();
        assertEquals(1, solution5377.numSteps("10"));
        assertEquals(3, solution5377.numSteps("11"));
        assertEquals(6, solution5377.numSteps("1101"));
        assertEquals(85, solution5377.numSteps("1111011110000011100000110001011011110010111001010111110001"));
        assertEquals(89, solution5377.numSteps("1111110011101010110011100100101110010100101110111010111110110010"));
    }
}

package com.company.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer58ATest {
    private static Offer58A offer58A = new Offer58A();

    @Test
    void reverseWords() {
        assertEquals("world! hello", offer58A.reverseWords("  hello world!  "));
        assertEquals("example good a", offer58A.reverseWords("a good   example"));
    }
}

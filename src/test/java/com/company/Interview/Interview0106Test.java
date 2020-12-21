package com.company.Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Interview0106Test {
    private static Interview0106 interview0106 = new Interview0106();

    @Test
    void compressString() {
        assertEquals("a2b1c5a3", interview0106.compressString("aabcccccaaa"));
        assertEquals("abbccd", interview0106.compressString("abbccd"));
    }
}

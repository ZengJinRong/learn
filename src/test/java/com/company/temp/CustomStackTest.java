package com.company.temp;

import com.company.solution.CustomStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomStackTest {

    @Test
    void test() {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.increment(5, 100);
        stack.increment(2, 100);
        assertEquals(103, stack.pop());
        assertEquals(202, stack.pop());
        assertEquals(201, stack.pop());
        assertEquals(-1, stack.pop());
    }

}

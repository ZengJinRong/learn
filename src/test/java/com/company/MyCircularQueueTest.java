package com.company;

import com.company.structure.MyCircularQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyCircularQueueTest {
    @Test
    void test() {
        MyCircularQueue circularQueue = new MyCircularQueue(3);

        Assertions.assertTrue(circularQueue.isEmpty());
        Assertions.assertFalse(circularQueue.isFull());

        Assertions.assertTrue(circularQueue.enQueue(1));
        Assertions.assertTrue(circularQueue.enQueue(2));
        Assertions.assertTrue(circularQueue.enQueue(3));
        Assertions.assertFalse(circularQueue.enQueue(4));

        Assertions.assertEquals(1, circularQueue.Front());
        Assertions.assertEquals(3, circularQueue.Rear());

        Assertions.assertFalse(circularQueue.isEmpty());
        Assertions.assertTrue(circularQueue.isFull());

        Assertions.assertTrue(circularQueue.deQueue());

        Assertions.assertTrue(circularQueue.enQueue(4));

        Assertions.assertEquals(2, circularQueue.Front());
        Assertions.assertEquals(4, circularQueue.Rear());
    }

    @Test
    void test2() {
        MyCircularQueue circularQueue = new MyCircularQueue(6);
        Assertions.assertTrue(circularQueue.enQueue(6));
        Assertions.assertEquals(6, circularQueue.Rear());
        Assertions.assertEquals(6, circularQueue.Rear());
        Assertions.assertTrue(circularQueue.deQueue());
        Assertions.assertTrue(circularQueue.enQueue(5));
        Assertions.assertEquals(5, circularQueue.Rear());
        Assertions.assertTrue(circularQueue.deQueue());
        Assertions.assertEquals(0, circularQueue.Front());
        Assertions.assertFalse(circularQueue.deQueue());
        Assertions.assertFalse(circularQueue.deQueue());
        Assertions.assertFalse(circularQueue.deQueue());
    }
}

package com.company.solution;

import com.company.structure.MyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution328Test {
    private static Solution328 solution328 = new Solution328();

    @Test
    void oddEvenList() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        solution328.oddEvenList(linkedList.getHead());
        assertEquals(1,linkedList.get(0));
        assertEquals(3,linkedList.get(1));
        assertEquals(5,linkedList.get(2));
        assertEquals(2,linkedList.get(3));
        assertEquals(4,linkedList.get(4));
        assertEquals(-1,linkedList.get(5));
    }
}

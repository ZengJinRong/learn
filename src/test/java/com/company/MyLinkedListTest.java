package com.company;

import com.company.structure.MyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void test() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        assertEquals(1, linkedList.get(0));
        assertEquals(3, linkedList.get(1));
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        assertEquals(1, linkedList.get(0));
        assertEquals(2, linkedList.get(1));
        assertEquals(3, linkedList.get(2));
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        assertEquals(1, linkedList.get(0));
        assertEquals(3, linkedList.get(1));
    }


    @Test
    void test2() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(2);
        linkedList.deleteAtIndex(1);

        linkedList.addAtHead(2);
        linkedList.addAtHead(7);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(5);
        linkedList.addAtTail(5);

        assertEquals(5, linkedList.get(6));
        assertEquals(2, linkedList.get(5));
        assertEquals(2, linkedList.get(4));
        assertEquals(7, linkedList.get(3));
        assertEquals(3, linkedList.get(2));
        assertEquals(2, linkedList.get(1));
        assertEquals(5, linkedList.get(0));

        linkedList.deleteAtIndex(6);
        linkedList.deleteAtIndex(4);

        assertEquals(2, linkedList.get(4));
        assertEquals(7, linkedList.get(3));
        assertEquals(3, linkedList.get(2));
        assertEquals(2, linkedList.get(1));
        assertEquals(5, linkedList.get(0));

    }
}

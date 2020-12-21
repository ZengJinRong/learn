package com.company.solution;

import com.company.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution83Test {
    private static Solution83 solution83 = new Solution83();

    @Test
    void deleteDuplicates() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode listNode = solution83.deleteDuplicates(head);
        assertEquals(1, listNode.val);
        assertEquals(2, listNode.next.val);
        assertNull(listNode.next.next);
    }


    @Test
    void deleteDuplicates2() {
        ListNode head;
        ListNode listNode;

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        listNode = solution83.deleteDuplicates2(head);
        assertEquals(1, listNode.val);
        assertEquals(2, listNode.next.val);
        assertNull(listNode.next.next);

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        listNode = solution83.deleteDuplicates2(head);
        assertEquals(1, listNode.val);
        assertNull(listNode.next);

        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        listNode = solution83.deleteDuplicates2(head);
        assertEquals(1, listNode.val);
        assertEquals(2, listNode.next.val);
        assertEquals(3, listNode.next.next.val);
        assertNull(listNode.next.next.next);
    }
}

package com.company.solution;

import com.company.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution141Test {
    private static Solution141 solution141 = new Solution141();

    @Test
    void hasCycle() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        assertFalse(solution141.hasCycle(head));
        head.next.next.next.next = head;
        assertTrue(solution141.hasCycle(head));
    }

    @Test
    void hasCycle2() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        assertFalse(solution141.hasCycle2(head));
        head.next.next.next.next = head;
        assertTrue(solution141.hasCycle2(head));
    }
}

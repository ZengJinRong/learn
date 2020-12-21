package com.company.solution;

import com.company.structure.ListNode;

/**
 * 206. 反转链表
 */
public class Solution206 {

    /**
     * TODO:理解解题思路
     */
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = previous;
            previous = current;
            current = nextTemp;
        }
        return previous;
    }
}

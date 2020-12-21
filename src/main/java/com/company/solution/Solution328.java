package com.company.solution;

import com.company.structure.ListNode;

/**
 * 328. 奇偶链表
 */
public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddNode = head;
        ListNode evenHead = head.next;
        ListNode evenNode = head.next;
        while (evenNode.next != null) {
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            if (oddNode.next == null) {
                break;
            }
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHead;
        evenNode.next = null;
        return head;
    }
}

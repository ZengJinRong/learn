package com.company.solution;

import com.company.structure.ListNode;

/**
 * 876. 链表的中间结点
 */
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null) {
            slow = slow.next;
        }
        return slow;
    }
}

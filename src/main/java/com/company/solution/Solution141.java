package com.company.solution;


import com.company.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode faster = head;
        while (faster != null && faster.next != null) {
            head = head.next;
            faster = faster.next.next;
            if (head == faster) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle3(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}


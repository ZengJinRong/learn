package com.company.solution;

import com.company.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode node = head; node != null; node = node.next) {
            if (set.contains(node)) {
                return node;
            } else {
                set.add(node);
            }
        }
        return null;
    }

    /**
     * 设：head到入环点的距离为F,入环点到相遇点距离为a, 环长度为a+b，n=绕环次数,
     * F+n*(a+b)+a=2*(F+a)
     * F+(n+1)a+nb=2F+2a
     * F=nb+(n-1)a
     * F%(a+b)=b
     * 故：若指针1从head出发,指针2从相遇点出发，速度均为1，则二者会在入环点相遇
     */
    public ListNode detectCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

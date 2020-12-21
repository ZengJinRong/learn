package com.company.solution;

import com.company.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 160. 相交链表
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            nodeA = (nodeA == null) ? headB : nodeA.next;
            nodeB = (nodeB == null) ? headA : nodeB.next;
        }
        return nodeA;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        boolean switchA = true;
        boolean switchB = true;
        while (nodeA != nodeB) {
            nodeA = nodeA.next;
            if (nodeA == null && switchA) {
                nodeA = headB;
                switchA = false;
            }

            nodeB = nodeB.next;
            if (nodeB == null && switchB) {
                nodeB = headA;
                switchB = false;
            }
        }
        return nodeA;
    }

    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != null) {
            set.add(nodeA);
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            if (set.contains(nodeB)) {
                return nodeB;
            }
            nodeB = nodeB.next;
        }
        return null;
    }

}

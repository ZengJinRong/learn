package com.company.offer;

import com.company.structure.ListNode;

import java.util.List;

/**
 * 面试题25. 合并两个排序的链表
 */
public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode prev = sentinel;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = (l1 == null) ? l2 : l1;
        return sentinel.next;
    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            return mergeTwoLists(l2, l1);
        }
        ListNode node = l1;
        while (l2 != null) {
            if (node.next == null) {
                node.next = l2;
                return l1;
            } else if (l2.val < node.next.val) {
                ListNode temp = l2.next;
                l2.next = node.next;
                node.next = l2;
                l2 = temp;
            }
            node = node.next;

        }
        return l1;
    }
}

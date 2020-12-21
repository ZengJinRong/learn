package com.company.offer;

import com.company.structure.ListNode;

/**
 * 面试题18. 删除链表的节点
 */
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode sentinel=new ListNode(0);
        sentinel.next = head;

        for (ListNode pre = sentinel; pre.next != null; pre = pre.next) {
            System.out.println("");
            if (pre.next.val == val) {
                pre.next = pre.next.next;
                break;
            }
        }

        return sentinel.next;
    }
}

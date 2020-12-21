package com.company.solution;

import com.company.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 61. 旋转链表
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node);
        }

        int size = list.size();
        k = k % size;
        if (k != 0) {
            list.get(size - 1).next = list.get(0);
            head = list.get(size - 1 - k).next;
            list.get(size - 1 - k).next = null;
        }
        return head;
    }

    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;
        int count = 1;
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }
        tail.next = head;

        tail = head;
        for (int i = 1; i < count - k % count; i++) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }
}

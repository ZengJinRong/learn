package com.company.offer;

import com.company.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题22. 链表中倒数第k个节点
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node);
        }
        int index = list.size() - k;
        return list.get(index);
    }
}

package com.company.solution;

import com.company.structure.ListNode;

/**
 * 237. 删除链表中的节点
 */
public class Solution237 {

    /**
     * FIXME:链表只需删除一个节点
     */
    public void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }

    public void deleteNode2(ListNode node) {
        ListNode scapegoat = node.next;
        node.val = scapegoat.val;
        node.next = scapegoat.next;
        scapegoat.next = null;
    }
}

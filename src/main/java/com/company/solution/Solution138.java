package com.company.solution;

/**
 * 138. 复制带随机指针的链表
 */
public class Solution138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node ptr = head;
        while (ptr != null) {
            Node newNode = new Node(ptr.val);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }

        ptr = head;

        while (ptr != null) {
            ptr.next.random = (ptr.random == null) ? null : ptr.random.next;
            ptr = ptr.next.next;
        }

        Node ptrOldList = head;
        Node ptrNewList = head.next;
        Node headNew = head.next;
        while (ptrOldList != null) {
            ptrOldList.next = ptrOldList.next.next;
            ptrNewList.next = (ptrNewList.next == null) ? null : ptrNewList.next.next;
            ptrOldList = ptrOldList.next;
            ptrNewList = ptrNewList.next;
        }
        return headNew;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

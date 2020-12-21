package com.company.solution;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 430. 扁平化多级双向链表
 */
public class Solution430 {
    /**
     * TODO:理解解题思路
     */
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node dummyHead = new Node(0, null, head, null);
        Node curr;
        Node prev = dummyHead;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null) {
                stack.push(curr.next);
            }
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        dummyHead.next.prev = null;
        return dummyHead.next;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val, Node prev, Node next, Node child) {
            this.val = val;
            this.prev = prev;
            this.next = next;
            this.child = child;
        }
    };
}

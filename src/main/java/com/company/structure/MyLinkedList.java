package com.company.structure;

public class MyLinkedList {
    private ListNode head;

    public ListNode getHead() {
        return head;
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
            if (node == null) {
                return -1;
            }
        }
        return node.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new ListNode(val);
            return;
        }
        ListNode node = new ListNode(head.val);
        node.next = head.next;
        head.val = val;
        head.next = node;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (head == null) {
            head = new ListNode(val);
            return;
        }
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new ListNode(val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        if (node.next == null) {
            node.next = new ListNode(val);
        } else {
            ListNode newNode = new ListNode(val);
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
            if (node.next == null) {
                return;
            }
        }
        if (node.next == null) {
            return;
        }
        node.next = node.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

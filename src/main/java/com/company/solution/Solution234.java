package com.company.solution;

import com.company.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 234. 回文链表
 */
public class Solution234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        int middle = list.size() / 2;
        for (int i = 0; i < middle; i++) {
            if (!list.get(list.size() - 1 - i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 递归
     * TODO：理解解题原理
     */
    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome3(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }

}

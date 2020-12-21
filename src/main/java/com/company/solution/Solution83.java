package com.company.solution;

import com.company.structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 83. 删除排序链表中的重复元素
 */
public class Solution83 {

    /**
     * FIXME:题为排序链表,无需用到哈希表
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        while (curr != null && curr.next != null) {
            if (set.contains(curr.next.val)) {
                curr.next = curr.next.next;
            } else {
                set.add(curr.next.val);
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        for (ListNode curr = head; curr != null && curr.next != null; curr = curr.next) {
            while (curr.next != null && curr.next.val == curr.val) {
                curr.next = curr.next.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates3(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}

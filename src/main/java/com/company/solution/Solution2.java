package com.company.solution;

import com.company.structure.ListNode;

import java.util.List;

/**
 * 2. 两数相加
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode prev = sentinel;
        int carry = 0;
        while (node1 != null && node2 != null) {
            int val = node1.val + node2.val + carry;
            carry = val / 10;
            prev.next = new ListNode(val % 10);
            prev = prev.next;
            node1 = node1.next;
            node2 = node2.next;
        }

        if (node1 != null) {
            prev.next = node1;
        } else if (node2 != null) {
            prev.next = node2;
        }

        while (carry == 1) {
            if (prev.next == null) {
                prev.next = new ListNode(0);
            }
            prev = prev.next;
            int val = prev.val + carry;
            if (val >= 10) {
                val = val % 10;
            } else {
                carry = 0;
            }
            prev.val = val;
        }

        return sentinel.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    /**
     * FIXME:溢出
     */
    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        long num1 = 0;
        ListNode node1 = l1;
        long multiple = 1;
        while (node1 != null) {
            num1 += node1.val * multiple;
            multiple *= 10;
            node1 = node1.next;
        }

        long num2 = 0;
        ListNode node2 = l2;
        multiple = 1;
        while (node2 != null) {
            num2 += node2.val * multiple;
            multiple *= 10;
            node2 = node2.next;
        }

        long sum = num1 + num2;
        if (sum == 0) {
            return new ListNode(0);
        }
        ListNode sentinel = new ListNode(0);
        ListNode prev = sentinel;
        while (sum != 0) {
            prev.next = new ListNode((int) (sum % 10));
            prev = prev.next;
            sum = sum / 10;
        }
        return sentinel.next;
    }
}

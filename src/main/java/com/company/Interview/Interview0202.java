package com.company.Interview;

import com.company.structure.ListNode;

/**
 * 面试题 02.02. 返回倒数第 k 个节点
 */
public class Interview0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        int index = 0;
        while (fast != null) {
            fast = fast.next;
            if (index < k) {
                index++;
            } else {
                slow = slow.next;
            }
        }
        return slow.val;
    }
}

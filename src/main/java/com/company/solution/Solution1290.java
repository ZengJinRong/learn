package com.company.solution;

import com.company.structure.ListNode;

/**
 * 1266. 访问所有点的最小时间
 */
public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode curr = head;
        while (curr != null) {
            num = (num << 1) + curr.val;
            curr = curr.next;
        }
        return num;
    }
}

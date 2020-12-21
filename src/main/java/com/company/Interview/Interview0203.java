package com.company.Interview;

import com.company.structure.ListNode;

/**
 * 面试题 02.03. 删除中间节点
 */
public class Interview0203 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

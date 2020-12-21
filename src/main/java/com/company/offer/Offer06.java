package com.company.offer;

import com.company.structure.ListNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 面试题06. 从尾到头打印链表
 */
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list=new LinkedList<>();
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node.val);
        }
        Collections.reverse(list);
        return list.stream().mapToInt(x -> x).toArray();
    }
}

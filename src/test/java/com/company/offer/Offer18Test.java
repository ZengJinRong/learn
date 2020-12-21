package com.company.offer;

import com.company.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer18Test {
    private static Offer18 offer18 = new Offer18();
    @Test
    void deleteNode() {
        ListNode head = new ListNode(-3);
        head.next = new ListNode(5);
        head.next = new ListNode(-99);
        offer18.deleteNode(head,-99);
    }
}

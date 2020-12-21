package com.company.error;

import com.company.structure.ListNode;
import com.company.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 5346. 二叉树中的列表
 */
public class Solution5346 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        List<TreeNode> headList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val == head.val) {
                headList.add(node);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }

        a:
        for (TreeNode treeNode : headList) {
            ListNode listNode = head;
            while (listNode.next != null) {
                if (treeNode == null) {
                    continue a;
                }
                int val = listNode.next.val;
                if (treeNode.left != null && treeNode.left.val == val) {
                    treeNode = treeNode.left;
                } else if (treeNode.right != null && treeNode.right.val == val) {
                    treeNode = treeNode.left;
                } else {
                    continue a;
                }
                listNode = listNode.next;
            }
            return true;
        }
        return false;
    }
}

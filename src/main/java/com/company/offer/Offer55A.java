package com.company.offer;

import com.company.structure.TreeNode;

/**
 * 面试题55 - I. 二叉树的深度
 * TODO:迭代解法
 */
public class Offer55A {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

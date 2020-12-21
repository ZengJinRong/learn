package com.company.solution;

import com.company.structure.TreeNode;

/**
 * 814. 二叉树剪枝
 */
public class Solution814 {

    /**
     * 递归法
     * TODO:理解解题思路
     */
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }

    private boolean containsOne(TreeNode node) {
        if (node == null) return false;
        boolean a1 = containsOne(node.left);
        boolean a2 = containsOne(node.right);
        if (!a1) node.left = null;
        if (!a2) node.right = null;
        return node.val == 1 || a1 || a2;
    }

}

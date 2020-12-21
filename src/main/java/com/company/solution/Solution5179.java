package com.company.solution;

import com.company.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 5179. 将二叉搜索树变平衡
 */
public class Solution5179 {
    private List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        recursionMiddleOrderTraversal(root);
        return convertListToBST(0, list.size() - 1);
    }

    public void recursionMiddleOrderTraversal(TreeNode root) {
        if (root != null) {
            recursionMiddleOrderTraversal(root.left);
            list.add(root.val);
            recursionMiddleOrderTraversal(root.right);
        }
    }

    private TreeNode convertListToBST(int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = left + (right - left) / 2;
        Integer val = list.get(middle);
        TreeNode node = new TreeNode(val);
        if (left != right) {
            node.left = convertListToBST(left, middle - 1);
            node.right = convertListToBST(middle + 1, right);
        }
        return node;
    }
}

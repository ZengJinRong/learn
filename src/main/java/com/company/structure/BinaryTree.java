package com.company.structure;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTreeNode find(Integer value) {
        BinaryTreeNode curr = root;
        while (curr != null) {
            if (curr.value > value) {
                curr = curr.leftChild;
            } else if (curr.value < value) {
                curr = curr.rightChild;
            } else {
                return curr;
            }
        }
        return null;
    }

    public boolean insert(Integer value) {
        BinaryTreeNode node = new BinaryTreeNode(value);
        if (root == null) {
            root = node;
            return true;
        }

        BinaryTreeNode curr = root;
        BinaryTreeNode parent;
        while (true) {
            parent = curr;
            if (curr.value > value) {
                curr = curr.leftChild;
                if (curr == null) {
                    parent.leftChild = node;
                    return true;
                }
            } else {
                curr = curr.rightChild;
                if (curr == null) {
                    parent.rightChild = node;
                    return true;
                }
            }
        }
    }


    public void infixOrder(BinaryTreeNode node) {
        if (node != null) {
            infixOrder(node.leftChild);
            System.out.println(node.value);
            infixOrder(node.rightChild);
        }
    }

    public void preOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.println(node.value);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public void postOrder(BinaryTreeNode node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println(node.value);
        }
    }

    public BinaryTreeNode min() {
        if (root == null) {
            return null;
        }
        BinaryTreeNode min = root;
        while (min.leftChild != null) {
            min = min.leftChild;
        }
        return min;
    }


    public BinaryTreeNode max() {
        if (root == null) {
            return null;
        }
        BinaryTreeNode max = root;
        while (max.rightChild != null) {
            max = max.rightChild;
        }
        return max;
    }

    public boolean delete(Integer value) {
        // TODO: 2020/2/3  
        return true;
    }

    class BinaryTreeNode {
        private BinaryTreeNode leftChild;
        private BinaryTreeNode rightChild;
        private BinaryTreeNode root;
        private Integer value;

        public BinaryTreeNode(Integer value) {
            this.value = value;
        }
    }

}

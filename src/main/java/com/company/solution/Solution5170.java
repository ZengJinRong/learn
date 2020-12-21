package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 5170. 验证二叉树
 */
public class Solution5170 {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> set = new HashSet<>();
        for (int i : leftChild) {
            if (i == -1) {
                continue;
            }
            if (i == 0) {
                return false;
            }
            set.add(i);
        }
        for (int i : rightChild) {
            if (i == -1) {
                continue;
            }
            if (i == 0) {
                return false;
            }
            if (set.contains(i)) {
                return false;
            } else {
                set.add(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
}

package com.company.solution;

/**
 * 836. 矩形重叠
 * TODO:理解解题思路
 */
public class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0]
                || rec1[3] <= rec2[1]
                || rec1[0] >= rec2[2]
                || rec1[1] >= rec2[3]);
    }
}

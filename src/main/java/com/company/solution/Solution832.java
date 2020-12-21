package com.company.solution;

/**
 * 832. 翻转图像
 */
public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            int length = row.length;
            for (int i = 0; i <= (length - 1) / 2; i++) {
                int temp = row[i];
                row[i] = 1 - row[length - 1 - i];
                row[length - 1 - i] = 1 - temp;
            }
        }
        return A;
    }

    /**
     * TODO:理解位运算
     */
    public int[][] flipAndInvertImage2(int[][] A) {
        int C = A[0].length;
        for (int[] row : A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }

}

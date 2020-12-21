package com.company.solution;

/**
 * 1252. 奇数值单元格的数目
 */
public class Solution1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int ans = 0;
        int[][] matrix = new int[n][m];
        for (int[] index : indices) {
            int x = index[0];
            int y = index[1];
            for (int i = 0; i < m; i++) {
                matrix[x][i]++;
            }
            for (int i = 0; i < n; i++) {
                matrix[i][y]++;
            }
        }
        for (int[] index : matrix) {
            for (int i : index) {
                System.out.print(i + " ");
                ans += i % 2;
            }
            System.out.println();
        }
        return ans;
    }

    public int oddCells2(int n, int m, int[][] indices) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for (int[] index : indices) {
            row[index[0]] = !row[index[0]];
            col[index[1]] = !col[index[1]];
        }
        //奇数次处理行数和列数
        int ansCol = 0;
        int ansRow = 0;
        for (boolean b : row) {
            if (b) {
                ansRow++;
            }
        }
        for (boolean b : col) {
            if (b) {
                ansCol++;
            }
        }
        //集合角度来看
        return ansRow * m + ansCol * n - 2 * ansRow * ansCol;
    }
}

package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 5152. 将矩阵按对角线排序
 */
public class Solution5152 {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int row = 0; row < m; row++) {
            List<Integer> list = new ArrayList<>();
            for (int x = 0; x < Math.min(n, m - row); x++) {
                int y = (row + x) % m;
                list.add(mat[y][x]);
            }
            list.sort(Integer::compareTo);
            for (int x = 0; x < Math.min(n, m - row); x++) {
                int y = (row + x) % m;
                mat[y][x] = list.get(x);
            }
        }

        for (int col = 1; col < n; col++) {
            List<Integer> list = new ArrayList<>();
            for (int y = 0; y < Math.min(m, n - col); y++) {
                int x = (col + y) % n;
                list.add(mat[y][x]);
            }
            list.sort(Integer::compareTo);
            for (int y = 0; y < Math.min(m, n - col); y++) {
                int x = (col + y) % n;
                mat[y][x] = list.get(y);
            }
        }
        return mat;
    }

    /*public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int col = 0; col < n; col++) {
            List<Integer> colList = new ArrayList<>();
            for (int y = 0; y < m; y++) {
                int x = (col + y) % n;
                colList.add(mat[y][x]);
            }
            colList.sort(Integer::compareTo);
            for (int y = 0; y < m; y++) {
                int x = (col + y) % n;
                mat[y][x] = colList.get(y);
            }
        }
        return mat;
    }*/
}

package com.company.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 5328. 方阵中战斗力最弱的 K 行
 */
public class Solution5328 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rows = new int[m];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int num : mat[i]) {
                if (num == 0) {
                    break;
                }
                sum++;
            }
            rows[i] = sum;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < rows.length; j++) {
                if (list.contains(j)) {
                    continue;
                }
                int row = rows[j];
                if (row < min) {
                    min = row;
                    index = j;
                }
            }
            list.add(index);
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}

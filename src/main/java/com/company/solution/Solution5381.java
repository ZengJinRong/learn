package com.company.solution;

/**
 * 5381. 查询带键的排列
 */
public class Solution5381 {
    public int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = i + 1;
        }

        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];

            for (int j = 0; j < p.length; j++) {
                if (p[j] == query) {
                    ans[i] = j;
                    if (j != 0) {
                        System.arraycopy(p, 0, p, 1, j);
                        p[0] = query;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}

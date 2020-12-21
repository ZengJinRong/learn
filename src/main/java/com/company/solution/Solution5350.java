package com.company.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 5350. 将整数按权重排序
 */
public class Solution5350 {
    public int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = lo; i <= hi; i++) {
            list.add(i);
        }
        list.sort(Comparator.comparingInt(this::weights));
        return list.get(k - 1);
    }

    private int weights(int x) {
        int weight = 0;
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            weight++;
        }
        return weight;
    }
}

package com.company.solution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 119. 杨辉三角 II
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevList = new ArrayList<>();
        prevList.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currList = new ArrayList<>();
            currList.add(1);
            for (int j = 0; j < prevList.size() - 1; j++) {
                int val = prevList.get(j) + prevList.get(j + 1);
                currList.add(val);
            }
            currList.add(1);
            prevList = currList;
        }
        return prevList;
    }

    public List<Integer> getRow2(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);

        for (int i = 1; i < rowIndex; i++) {
            result.add(1);
            for (int j = 0; j < i; j++) {
                result.add(result.get(0) + result.get(1));
                result.remove(0);
            }
            result.add(1);
            result.remove(0);
        }
        return result;
    }

    /**
     * 公式算法
     */
    public List<Integer> getRow3(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long prev = 1;
        list.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            long cur = prev * (rowIndex - i + 1) / i;
            list.add((int) cur);
            prev = cur;
        }
        return list;
    }
}

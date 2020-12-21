package com.company.solution;


import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (numRows == 0) {
            return resultList;
        }
        List<Integer> prevList = new ArrayList<>();
        prevList.add(1);
        resultList.add(prevList);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> currList = new ArrayList<>();
            currList.add(1);
            for (int j = 0; j < prevList.size() - 1; j++) {
                int val = prevList.get(j) + prevList.get(j + 1);
                currList.add(val);
            }
            currList.add(1);
            resultList.add(currList);
            prevList = currList;
        }
        return resultList;
    }
}

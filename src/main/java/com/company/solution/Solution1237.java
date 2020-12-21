package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 1237. 找出给定方程的正整数解
 * TODO:理解解题思路
 */
public class Solution1237 {
    interface CustomFunction {
        int f(int x, int y);
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        int x = 1;
        int y = 1000;
        while (x <= 1000 && y >= 1) {
            int temp = customfunction.f(x, y);
            if (temp > z) {
                y--;
            } else if (temp < z) {
                x++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(x);
                list.add(y);
                result.add(list);
                x++;
                y--;
            }
        }
        return result;
    }
}

package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 5354. 通知所有员工所需的时间
 */
public class Solution5354 {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < informTime.length; i++) {
            if (informTime[i] == 0) {
                list.add(i);
            }
        }

        int max = 0;
        for (Integer id : list) {
            int time = 0;
            while (id != -1) {
                time += informTime[id];
                id = manager[id];
            }
            if (time > max) {
                max = time;
            }
        }
        return max;
    }

}

package com.company.solution;

import java.util.*;

/**
 * 5342. 最多可以参加的会议数目
 */
public class Solution5342 {
    public int maxEvents(int[][] events) {
        int ans = 0;
        Arrays.sort(events, Comparator.comparingInt(event -> event[1]));
        Set<Integer> set = new HashSet<>();
        for (int[] event : events) {
            int startDay = event[0];
            int endDay = event[1];
            Integer temp = null;
            for (int i = startDay; i <= endDay; i++) {
                if (!set.contains(i)) {
                    temp = i;
                    break;
                }
            }
            if (temp != null) {
                set.add(temp);
                ans++;
            }
        }
        return ans;
    }
}

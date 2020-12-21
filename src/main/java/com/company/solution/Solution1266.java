package com.company.solution;

/**
 * 1266. 访问所有点的最小时间
 */
public class Solution1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int step = 0;
        int x = points[0][0];
        int y = points[0][1];
        for (int i = 1; i < points.length; i++) {
            int xNext = points[i][0];
            int yNext = points[i][1];
            int xDistance = Math.abs(x - xNext);
            int yDistance = Math.abs(y - yNext);
            step += Math.max(xDistance, yDistance);
            x = xNext;
            y = yNext;
        }
        return step;
    }
}

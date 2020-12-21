package com.company.solution;

/**
 * 5313. 时钟指针的夹角
 */
public class Solution5313 {
    public double angleClock(int hour, int minutes) {
        double hourAngle = hour * 360D / 12D + minutes * 360D / 12D / 60D;
        double minutesAngle = minutes * 360D / 60D;
        double angle = Math.abs(hourAngle - minutesAngle) % 360D;
        return angle < 180D ? angle : 360D - angle;
    }
}

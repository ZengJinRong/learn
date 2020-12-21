package com.company.solution;

/**
 * 1189. “气球” 的最大数量
 */
public class Solution1189 {

    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    count[0]++;
                    break;
                case 'a':
                    count[1]++;
                    break;
                case 'l':
                    count[2]++;
                    break;
                case 'o':
                    count[3]++;
                    break;
                case 'n':
                    count[4]++;
                    break;
                default:
                    break;
            }
        }
        count[2] /= 2;
        count[3] /= 2;
        int min = Integer.MAX_VALUE;
        for (int value : count) {
            min = Math.min(value, min);
        }
        return min;
    }

    public int maxNumberOfBalloons2(String text) {
        int[] count = new int[5];
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    count[0] += 2;
                    break;
                case 'a':
                    count[1] += 2;
                    break;
                case 'l':
                    count[2]++;
                    break;
                case 'o':
                    count[3]++;
                    break;
                case 'n':
                    count[4] += 2;
                    break;
                default:
                    break;
            }
        }
        int doubleMin = Integer.MAX_VALUE;
        for (int value : count) {
            doubleMin = Math.min(value, doubleMin);
        }
        return doubleMin / 2;
    }
}

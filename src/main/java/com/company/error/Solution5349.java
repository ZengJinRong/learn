package com.company.error;

import java.util.ArrayList;
import java.util.List;

/**
 * 5349. 安排电影院座位
 * FIXME:超出内存限制
 */
public class Solution5349 {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        List<boolean[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new boolean[10]);
        }
        for (int[] reservedSeat : reservedSeats) {
            int y = reservedSeat[0] - 1;
            int x = reservedSeat[1] - 1;
            list.get(y)[x] = true;
        }

        for (boolean[] row : list) {
            boolean left = !(row[1] || row[2] || row[3] || row[4]);
            boolean middle = !(left || row[3] || row[4] || row[5] || row[6]);
            boolean right = !(middle || row[5] || row[6] || row[7] || row[8]);
            if (left) {
                ans++;
            }
            if (middle) {
                ans++;
            }
            if (right) {
                ans++;
            }
        }
        return ans;
    }


/*    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        boolean[][] temp = new boolean[n][3];
        for (int[] reservedSeat : reservedSeats) {
            int y = reservedSeat[0];
            int x = reservedSeat[1];

            if (4 <= x && x <= 7) {
                temp[y - 1][1] = true;
            }
            if (2 <= x && x <= 5) {
                temp[y - 1][0] = true;
            } else if (6 <= x && x <= 9) {
                temp[y - 1][2] = true;
            }

        }

        for (boolean[] booleans : temp) {
            if (!booleans[0]) {
                booleans[1] = true;
                ans++;
            }
            if (!booleans[1]) {
                ans++;
            } else if (!booleans[2]) {
                ans++;
            }
        }

        return ans;
    }*/


/*    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        boolean[][] seat = new boolean[n][10];
        for (int[] reservedSeat : reservedSeats) {
            int y = reservedSeat[0] - 1;
            int x = reservedSeat[1] - 1;
            seat[y][x] = true;
        }

        for (boolean[] row : seat) {
            boolean left = !(row[1] || row[2] || row[3] || row[4]);
            boolean middle = !(left || row[3] || row[4] || row[5] || row[6]);
            boolean right = !(middle || row[5] || row[6] || row[7] || row[8]);
            if (left) {
                ans++;
            }
            if (middle) {
                ans++;
            }
            if (right) {
                ans++;
            }
        }
        return ans;
    }*/


    /*public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        boolean[][] seat = new boolean[n][10];
        for (int[] reservedSeat : reservedSeats) {
            int y = reservedSeat[0] - 1;
            int x = reservedSeat[1] - 1;
            seat[y][x] = true;
        }

        int[] temp = {1, 3, 5};
        for (boolean[] row : seat) {
            for (int t : temp) {
                boolean isE = true;
                for (int i = t; i < t + 4; i++) {
                    if (row[i]) {
                        isE = false;
                        break;
                    }
                    row[i] = true;
                }
                if (isE) {
                    ans++;
                }
            }
        }
        return ans;
    }*/

}

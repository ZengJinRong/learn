package com.company.solution;

/**
 * 374. 猜数字大小
 */
public class Solution374 {
    private int expected;

    public int getExpected() {
        return expected;
    }

    public void setExpected(int expected) {
        this.expected = expected;
    }

    private int guess(int num) {
        return Integer.compare(getExpected(), num);
    }

    public int guessNumber(int n) {
        long left = 0;
        long right = n;
        while (left < right) {
            long middle = (left + right) / 2;
            int result = guess((int) middle);
            if (result == -1) {
                right = middle;
            } else if (result == 1) {
                left = middle + 1;
            } else {
                return (int) middle;
            }
        }
        return (int) left;
    }

    /**
     * 二分法改进
     * 避免溢出
     */
    public int guessNumber2(int n) {
        int left = 0;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            int result = guess(middle);
            if (result == -1) {
                right = middle;
            } else if (result == 1) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return left;
    }
}

package com.company.solution;

/**
 * 278. 第一个错误的版本
 */
public class Solution278 {
    private int errorVersion = 1;

    public Solution278(int errorVersion) {
        this.errorVersion = errorVersion;
    }

    public void setErrorVersion(int errorVersion) {
        this.errorVersion = errorVersion;
    }

    private boolean isBadVersion(int version) {
        return version >= errorVersion;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}

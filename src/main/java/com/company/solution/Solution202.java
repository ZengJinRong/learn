package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 */
public class Solution202 {

    /**
     * 哈希表
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            set.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            n = sum;
        }
        return true;
    }

    /**
     * 双指针
     */
    public boolean isHappy2(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
            if (fast == 1) {
                return true;
            }
        } while (slow != fast);
        return false;
    }

    private int bitSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

}

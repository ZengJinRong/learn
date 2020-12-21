package com.company.Interview;

/**
 * 面试题 17.16. 按摩师
 * TODO:逃课
 */
public class Interview1716 {
    public int massage(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            int c = Math.max(b, a + num);
            a = b;
            b = c;
        }
        return b;
    }
}

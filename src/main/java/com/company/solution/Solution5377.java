package com.company.solution;

/**
 * 5377. 将二进制表示减到 1 的步骤数
 */
public class Solution5377 {
    public int numSteps(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        boolean isCarry = false;
        for (int i = chars.length - 1; i >= 1; i--) {
            ans++;
            if ((chars[i] == '0') == isCarry) {
                ans++;
                isCarry = true;
            }
        }
        if (isCarry) {
            ans++;
        }
        return ans;
    }

    public int numSteps2(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        long num = 0;
        for (char c : chars) {
            num *= 2;
            if (c == '1') {
                num++;
            }
        }
        while (num > 1) {
            num = (num % 2 == 0) ? num / 2 : num + 1;
            ans++;
        }
        return ans;
    }
}

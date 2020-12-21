package com.company.solution;

/**
 * 1221. 分割平衡字符串
 */
public class Solution1221 {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int countR = 0;
        int countL = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'R') {
                countR++;
            } else {
                countL++;
            }
            if (countL == countR) {
                ans++;
            }
        }
        return ans;
    }

    public int balancedStringSplit2(String s) {
        int ans = 0;
        int flag = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'R') {
                flag++;
            } else {
                flag--;
            }
            if (flag==0) {
                ans++;
            }
        }
        return ans;
    }
}

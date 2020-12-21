package com.company.solution;

/**
 * 292. Nim 游戏
 */
public class Solution292 {
    public boolean canWinNim(int n) {
        return (n & 3) != 0;
    }

    /**
     * TODO:理解位运算
     */
    public boolean canWinNim2(int n) {
        return (n & 3) != 0;
    }
}


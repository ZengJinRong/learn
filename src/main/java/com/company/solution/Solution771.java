package com.company.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 771. 宝石与石头
 */
public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (char jewelType : J.toCharArray()) {
            set.add(jewelType);
        }

        for (char stone : S.toCharArray()) {
            if (set.contains(stone)) {
                count++;
            }
        }
        return count;
    }
}

package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution14Test {
    private static Solution14 solution14 = new Solution14();

    @Test
    void longestCommonPrefix() {
        String[] strs = null;
        String longestCommonPrefix = solution14.longestCommonPrefix(strs);
        assertEquals(longestCommonPrefix, "");

        strs = new String[]{};
        longestCommonPrefix = solution14.longestCommonPrefix(strs);
        assertEquals(longestCommonPrefix, "");

        strs = new String[]{"alone"};
        longestCommonPrefix = solution14.longestCommonPrefix(strs);
        assertEquals(longestCommonPrefix, "alone");

        strs = new String[]{"flower", "flow", "flight"};
        longestCommonPrefix = solution14.longestCommonPrefix(strs);
        assertEquals(longestCommonPrefix, "fl");

        strs = new String[]{"dog", "racecar", "car"};
        longestCommonPrefix = solution14.longestCommonPrefix(strs);
        assertEquals(longestCommonPrefix, "");
    }

    @Test
    void longestCommonPrefix4() {
        String[] strs = null;
        String longestCommonPrefix = solution14.longestCommonPrefix4(strs);
        assertEquals(longestCommonPrefix, "");

        strs = new String[]{};
        longestCommonPrefix = solution14.longestCommonPrefix4(strs);
        assertEquals(longestCommonPrefix, "");

        strs = new String[]{"alone"};
        longestCommonPrefix = solution14.longestCommonPrefix4(strs);
        assertEquals(longestCommonPrefix, "alone");

        strs = new String[]{"flower", "flow", "flight"};
        longestCommonPrefix = solution14.longestCommonPrefix4(strs);
        assertEquals(longestCommonPrefix, "fl");

        strs = new String[]{"dog", "racecar", "car"};
        longestCommonPrefix = solution14.longestCommonPrefix4(strs);
        assertEquals(longestCommonPrefix, "");
    }

    @Test
    void longestCommonPrefix5() {
        String[] strs = null;
        String longestCommonPrefix = solution14.longestCommonPrefix5(strs);
        assertEquals(longestCommonPrefix, "");

        strs = new String[]{};
        longestCommonPrefix = solution14.longestCommonPrefix5(strs);
        assertEquals(longestCommonPrefix, "");

        strs = new String[]{"alone"};
        longestCommonPrefix = solution14.longestCommonPrefix5(strs);
        assertEquals(longestCommonPrefix, "alone");

        strs = new String[]{"flower", "flow", "flight"};
        longestCommonPrefix = solution14.longestCommonPrefix5(strs);
        assertEquals(longestCommonPrefix, "fl");

        strs = new String[]{"dog", "racecar", "car"};
        longestCommonPrefix = solution14.longestCommonPrefix5(strs);
        assertEquals(longestCommonPrefix, "");
    }
}

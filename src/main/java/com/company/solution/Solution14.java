package com.company.solution;

/**
 * 14. 最长公共前缀
 */
public class Solution14 {

    private char[] commonPrefix(char[] charsA, char[] charsB) {
        int maxPrefixLength = Math.min(charsA.length, charsB.length);
        char[] prefixChars = new char[maxPrefixLength];
        for (int i = 0; i < maxPrefixLength; i++) {
            if (charsA[i] == charsB[i]) {
                prefixChars[i] = charsA[i];
            } else {
                return prefixChars;
            }
        }
        return prefixChars;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        char[] prefixChars = strs[0].toCharArray();
        for (int i = 1; i < strs.length; i++) {
            prefixChars = commonPrefix(prefixChars, strs[i].toCharArray());
        }
        return new String(prefixChars).trim();
    }


    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }


    public String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }


    private String commonPrefix(String strA, String strB) {
        int maxPrefixLength = Math.min(strA.length(), strB.length());
        for (int i = 0; i < maxPrefixLength; i++) {
            if (strA.charAt(i) != strB.charAt(i)) {
                return strA.substring(0, i);
            }
        }
        return strA.substring(0, maxPrefixLength);
    }


    public String longestCommonPrefix4(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
        }
        return prefix;
    }


    public String longestCommonPrefix5(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int legtIndex, int rightIndex) {
        if (legtIndex == rightIndex) {
            return strs[legtIndex];
        } else {
            int midIndex = (legtIndex + rightIndex) / 2;
            String lcpLeft = longestCommonPrefix(strs, legtIndex, midIndex);
            String lcpRight = longestCommonPrefix(strs, midIndex + 1, rightIndex);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }


    /**
     * 二分查找法
     */
    public String longestCommonPrefix6(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        return true;
    }
}

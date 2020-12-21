package com.company.solution;

/**
 * 1047. 删除字符串中的所有相邻重复项
 */
public class Solution1047 {
    /**
     * TODO:理解解题思路
     */
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for (char character : S.toCharArray()) {
            if (sbLength != 0 && character == sb.charAt(sbLength - 1)) {
                sb.deleteCharAt(sbLength - 1);
                sbLength--;
            } else {
                sb.append(character);
                sbLength++;
            }
        }
        return sb.toString();
    }
}

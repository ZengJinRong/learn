package com.company.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. 同构字符串
 */
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            char sChar = sChars[i];
            char tChar = tChars[i];
            if (mapS[sChar] != mapT[tChar]) {
                return false;
            }
            if (mapS[sChar] == 0) {
                mapS[sChar] = i + 1;
                mapT[tChar] = i + 1;
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            char sChar = sChars[i];
            char tChar = tChars[i];
            boolean sCharInMap = map.containsKey(sChar);
            boolean different = sCharInMap && map.get(sChar) != tChar;
            boolean tRepeated = !sCharInMap && map.containsValue(tChar);
            if (different || tRepeated) {
                return false;
            }
            map.put(sChar, tChar);
        }
        return true;
    }


    public boolean isIsomorphic3(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            boolean sCharInMap = map.containsKey(sChar);
            boolean different = sCharInMap && map.get(sChar) != tChar;
            boolean tRepeated = !sCharInMap && map.containsValue(tChar);
            if (different || tRepeated) {
                return false;
            }
            map.put(sChar, tChar);
        }
        return true;
    }
}

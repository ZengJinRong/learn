package com.company.solution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class Solution20 {



    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.empty();
    }


    public boolean isValid2(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (stack.empty() || c != map.get(stack.pop())) {
                return false;
            }
        }
        return stack.empty();
    }


    public boolean isValid3(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.addLast(')');
            else if (c == '{')
                stack.addLast('}');
            else if (c == '[')
                stack.addLast(']');
            else if (stack.isEmpty() || c != stack.removeLast()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}

package com.company.solution;

/**
 * 38. 外观数列
 */
public class Solution38 {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String prev = countAndSay(n - 1);
        char[] prevChars = prev.toCharArray();
        int count = 1;
        char temp = prevChars[0];
        for (int i = 1; i < prevChars.length; i++) {
            if (prevChars[i] == temp) {
                count++;
            } else {
                stringBuilder.append(count);
                stringBuilder.append(temp);
                count = 1;
                temp = prevChars[i];
            }
        }
        stringBuilder.append(count);
        stringBuilder.append(temp);
        return stringBuilder.toString();
    }

    public String countAndSay2(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String prev = countAndSay(n - 1);
        int count = 1;
        char temp = prev.charAt(0);
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == temp) {
                count++;
            } else {
                stringBuilder.append(count);
                stringBuilder.append(temp);
                count = 1;
                temp = prev.charAt(i);
            }
        }
        stringBuilder.append(count);
        stringBuilder.append(temp);
        return stringBuilder.toString();
    }

    public String countAndSay3(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = str.toCharArray();
            int count = 1;
            char temp = chars[0];
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] == temp) {
                    count++;
                } else {
                    stringBuilder.append(count);
                    stringBuilder.append(temp);
                    count = 1;
                    temp = chars[j];
                }
            }
            stringBuilder.append(count);
            stringBuilder.append(temp);
            str = stringBuilder.toString();
        }
        return str;
    }


}

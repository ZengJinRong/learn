package com.company.Interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 面试题 16.08. 整数的英语表示
 * TODO:逃课
 */
public class Interview1608 {
    private final String[] num0_19 = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] num0_90 = new String[]{"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        List<String> res = new ArrayList<>();
        int hundred = 0;
        int thousand = 0;
        int million = 0;
        int billion = 0;
        if (num < 0) {
            res.add("Negative");
            num = -num;
        }
        if (num > 0) {
            hundred = num % 1000;
            num /= 1000;
            if (num > 0) {
                thousand = num % 1000;
                num /= 1000;
                if (num > 0) {
                    million = num % 1000;
                    num /= 1000;
                    if (num > 0) {
                        billion = num % 1000;
                    }
                }
            }
        }
        if (billion > 0) {
            res.addAll(change(billion));
            res.add("Billion");
        }
        if (million > 0) {
            res.addAll(change(million));
            res.add("Million");
        }
        if (thousand > 0) {
            res.addAll(change(thousand));
            res.add("Thousand");
        }
        if (hundred > 0) {
            res.addAll(change(hundred));
        }
        StringBuilder ans = new StringBuilder();
        for (String s : res) {
            if (ans.length() == 0)
                ans.append(s);
            else {
                ans.append(" ").append(s);
            }
        }
        return ans.toString();
    }

    private LinkedList<String> change(int num) {
        LinkedList<String> list = new LinkedList<>();
        int n = num % 100;
        if (0 < n && n < 20) {
            list.addFirst(num0_19[n]);
        } else if (n >= 20) {
            int m = n % 10;
            int mm = n / 10;
            if (m > 0)
                list.addFirst(num0_19[m]);
            list.addFirst(num0_90[mm]);
        }
        if (num >= 100) {
            list.addFirst("Hundred");
            list.addFirst(num0_19[num / 100]);
        }
        return list;
    }
}

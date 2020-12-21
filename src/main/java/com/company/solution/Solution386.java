package com.company.solution;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 386. 字典序排数
 */
public class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        return Stream.iterate(1, item -> item + 1).limit(n)
                .sorted(Comparator.comparing(String::valueOf))
                .collect(Collectors.toList());
    }


    /**
     * TODO:理解解题思路
     */
    public List<Integer> lexicalOrder2(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (i <= n) {
                list.add(i);
                add(list, n, i);
            } else {
                break;
            }
        }
        return list;
    }

    private void add(List<Integer> list, int n, int startNum) {
        startNum *= 10;
        for (int i = 0; i < 10; i++, startNum++) {
            if (startNum <= n) {
                list.add(startNum);
                add(list, n, startNum);
            } else {
                return;
            }
        }
    }
}

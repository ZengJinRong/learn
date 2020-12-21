package com.company.error;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Solution5359Test {
    private static Solution5359 solution5359 = new Solution5359();

    @Test
    void getCombinationResult() {
        List<Integer> list = Arrays.stream(new int[]{1, 2, 3, 4}).boxed().collect(Collectors.toList());
        List<List<Integer>> result = solution5359.getCombinationResult(3, list);
        for (List<Integer> integers : result) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer integer : integers) {
                stringBuilder.append(integer)
                        .append(' ');
            }
            System.out.println(stringBuilder.toString());
        }
    }
}

package com.company.solution;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 5345. 通过投票对团队排名
 */
public class Solution5345 {
    public String rankTeams(String[] votes) {
        HashMap<Character, int[]> map = new HashMap<>();
        int length = votes[0].length();
        for (String vote : votes) {
            char[] charArray = vote.toCharArray();
            for (int i = 0; i < length; i++) {
                char c = charArray[i];
                if (!map.containsKey(c)) {
                    map.put(c, new int[length]);
                }
                int[] rank = map.get(c);
                rank[i]++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        Stream<Map.Entry<Character, int[]>> stream = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey());

        for (int i = length - 1; i >= 0; i--) {
            int finalI = i;
            stream = stream.sorted(Comparator.comparingInt(entry -> -entry.getValue()[finalI]));
        }

        stream.forEach(entry -> stringBuilder.append(entry.getKey()));
        return stringBuilder.toString();
    }
}

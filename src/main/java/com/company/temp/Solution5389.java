package com.company.temp;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 5389. 点菜展示表
 */
public class Solution5389 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> ans = new ArrayList<>();

        Map<String, Map<String, Integer>> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (List<String> order : orders) {
            String tableNumber = order.get(1);
            String foodItem = order.get(2);

            Map<String, Integer> foodCountMap = map.computeIfAbsent(tableNumber, k -> new HashMap<>());
            foodCountMap.put(foodItem, foodCountMap.getOrDefault(foodItem, 0) + 1);
            set.add(foodItem);
        }

        List<String> foodList = set.stream().sorted().collect(Collectors.toList());


        List<String> title = new ArrayList<>();
        title.add("Table");
        title.addAll(foodList);
        ans.add(title);

        Set<Map.Entry<String, Map<String, Integer>>> entrySet = map.entrySet();
        List<Map.Entry<String, Map<String, Integer>>> entryList = entrySet.stream().sorted(Comparator.comparingInt(e -> Integer.parseInt(e.getKey()))).collect(Collectors.toList());
        for (Map.Entry<String, Map<String, Integer>> entry : entryList) {
            List<String> list = new ArrayList<>();
            list.add(entry.getKey());

            Map<String, Integer> value = entry.getValue();

            for (String foodItem : foodList) {
                int count = value.getOrDefault(foodItem, 0);
                list.add(String.valueOf(count));
            }
            ans.add(list);
        }

        return ans;
    }
}

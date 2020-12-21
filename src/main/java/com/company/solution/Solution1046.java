package com.company.solution;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1046. 最后一块石头的重量
 * TODO:其他解法
 */
public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue).reversed());
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            int diff = x - y;
            if (diff != 0) {
                queue.offer(diff);
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.peek();
    }
}

package com.company.Interview;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 面试题 17.20. 连续中值
 * TODO:逃课
 */
public class MedianFinder {
    Queue<Integer> max;
    Queue<Integer> min;
    int size;

    public MedianFinder() {
        max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        min = new PriorityQueue<>();
        size = 0;
    }

    public void addNum(int num) {
        int k = size / 2 + 1;
        if (max.size() < k) {
            if (!min.isEmpty() && min.peek() < num) {
                max.add(min.poll());
                min.add(num);
            } else {
                max.add(num);
            }
        } else {
            if (num < max.peek()) {
                min.add(max.poll());
                max.add(num);
            } else {
                min.add(num);
            }
        }
        size++;
    }

    public double findMedian() {
        return (size & 1) == 1 ? max.peek() : (max.peek() + min.peek()) * 1.0 / 2;
    }
}

package com.company.solution;

public class CustomStack {
    int[] array;
    int maxIndex;
    int maxSize;

    public CustomStack(int maxSize) {
        this.array = new int[maxSize];
        this.maxIndex = -1;
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (maxIndex < maxSize - 1) {
            maxIndex++;
            array[maxIndex] = x;
        }
    }

    public int pop() {
        if (maxIndex < 0) {
            return -1;
        }
        int val = array[maxIndex];
        maxIndex--;
        return val;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, maxIndex + 1); i++) {
            array[i] += val;
        }
    }
}

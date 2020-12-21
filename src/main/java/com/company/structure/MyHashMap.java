package com.company.structure;

import java.util.Arrays;

public class MyHashMap {
    int[][] table;

    public MyHashMap() {
        table = new int[1000][1000];
        for (int[] ints : table) {
            Arrays.fill(ints, -1);
        }
    }

    public void put(int key, int value) {
        table[hash(key)][key / 1000] = value;
    }

    public int get(int key) {
        return table[hash(key)][key / 1000];
    }

    public void remove(int key) {
        table[hash(key)][key / 1000] = -1;
    }

    private int hash(int key) {
        return key % 1000;
    }
}

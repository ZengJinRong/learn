package com.company.structure;

public class MyHashSet {
    boolean[][] table;

    public MyHashSet() {
        table = new boolean[1000][1000];
    }

    public void add(int key) {
        table[hash(key)][key / 1000] = true;
    }

    public void remove(int key) {
        table[hash(key)][key / 1000] = false;
    }

    public boolean contains(int key) {
        return table[hash(key)][key / 1000];
    }

    private int hash(int key) {
        return key % 1000;
    }
}

package com.company.solution;

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {
    List<Integer> list;

    public ProductOfNumbers() {
        list = new ArrayList<>();
    }

    public void add(int num) {
        list.add(num);
    }

    public int getProduct(int k) {
        int product = 1;
        for (int i = list.size() - 1; i >= list.size() - k; i--) {
            product *= list.get(i);
        }
        return product;
    }
}

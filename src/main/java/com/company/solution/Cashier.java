package com.company.solution;

import java.util.HashMap;

/**
 * 5324. 每隔 n 个顾客打折
 */
public class Cashier {
    private int n;
    private Double discount;
    HashMap<Integer, Integer> map;
    private int x;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.x = 0;
        this.n = n;
        this.discount = (double) discount;
        map = new HashMap<>();
        for (int i = 0; i < products.length; i++) {
            map.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        x++;
        double sum = 0;
        for (int i = 0; i < product.length; i++) {
            int pro = product[i];
            Integer price = map.get(pro);
            sum += price * amount[i];
        }
        if (x == n) {
            sum = sum * (1 - discount / 100D);
            x = 0;
        }
        return sum;
    }
}

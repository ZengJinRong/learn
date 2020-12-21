package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution599Test {
    private static Solution599 solution599 = new Solution599();

    @Test
    void findRestaurant() {
        assertArrayEquals(new String[]{"Shogun"},solution599.findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        assertArrayEquals(new String[]{"Shogun"},solution599.findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"}));
        assertArrayEquals(new String[]{},solution599.findRestaurant(
                new String[]{"Shogun", "Tapioca Express", "KFC"},
                new String[]{"Hungry Hunter Steakhouse","Burger King"}));
        assertArrayEquals(new String[]{"Shogun"},solution599.findRestaurant(
                new String[]{"Shogun"},
                new String[]{"Shogun"}));
    }
}

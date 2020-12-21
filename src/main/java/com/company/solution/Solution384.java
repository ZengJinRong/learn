package com.company.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 384. 打乱数组
 */
public class Solution384 {
    private int[] origin;
    private int[] array;
    private Random random = new Random();

    public Solution384(int[] nums) {
        this.origin = nums.clone();
        this.array = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        array = origin;
        origin = origin.clone();
        return array;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            int r = random.nextInt(array.length - i) + i;
            swapAt(i, r);
        }
        return array;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle2() {
        List<Integer> list = Arrays.stream(origin).boxed().collect(Collectors.toList());
        for (int i = 0; i < origin.length; i++) {
            int r = random.nextInt(list.size());
            Integer val = list.get(r);
            array[i] = val;
            list.remove(val);
        }
        return array;
    }
}

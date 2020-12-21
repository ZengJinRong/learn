package com.company;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class SolutionTest {

    @Test
    void arrayIncreaseTest() {
        int[] array = new int[]{1};
        array[0]++;
        System.out.println(array[0]);
    }

    @Test
    void loopTest() {
        long startTIme;
        long endTime;
        int loop = Integer.MAX_VALUE;
        startTIme = System.nanoTime();
        for (int i = 0; i < loop; i++) {
            boolean val = i % 2 == 0;
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTIme);

        startTIme = System.nanoTime();
        for (int i = 0; i < loop; i++) {
            boolean val = (i & 1) == 0;
        }
        endTime = System.nanoTime();
        System.out.println(endTime - startTIme);
    }

    @Test
    void overflowTest() {
        int i = 1;
        while (i > 0) {
            i++;
        }
        System.out.println(Math.abs(i + 2020));
        System.out.println(Integer.MIN_VALUE + 2020);
    }

    @Test
    void test() {
        long x = 9999999991L + 9;
        System.out.println(x);
        System.out.println();
    }

    @Test
    void testCalendar() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        System.out.println(df.format(date));

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_YEAR, -1);
        Date lastDate = cal.getTime();
        System.out.println(df.format(lastDate));
    }

    @Test
    void testBoolean() {
        Boolean a = null;
        if (a != null && a) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}

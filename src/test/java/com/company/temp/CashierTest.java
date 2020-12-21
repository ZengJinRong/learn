package com.company.temp;

import com.company.solution.Cashier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void test() {
        Cashier cashier = new Cashier(3, 50, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{100, 200, 300, 400, 300, 200, 100});
        assertEquals(500D, cashier.getBill(new int[]{1, 2}, new int[]{1, 2}));
        assertEquals(4000D, cashier.getBill(new int[]{3, 7}, new int[]{10, 10}));
        assertEquals(800D, cashier.getBill(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        assertEquals(4000D, cashier.getBill(new int[]{4}, new int[]{10}));
        assertEquals(4000D, cashier.getBill(new int[]{7, 3}, new int[]{10, 10}));
        assertEquals(7350D, cashier.getBill(new int[]{7, 5, 3, 1, 6, 4, 2}, new int[]{10, 10, 10, 9, 9, 9, 7}));
        assertEquals(2500D, cashier.getBill(new int[]{2, 3, 5}, new int[]{5, 3, 2}));
    }
}

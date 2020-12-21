package com.company.structure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MyHashSetTest {

    @Test
    void test(){
        MyHashSet set = new MyHashSet();
        assertFalse(set.contains(72));
        set.remove(91);
        set.add(48);
        set.add(41);
        set.remove(41);
        assertTrue(set.contains(48));
        assertFalse(set.contains(91));
        assertFalse(set.contains(41));
    }
}

package com.company.temp;

import com.company.solution.Solution5382;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5382Test {

    @Test
    void entityParser() {
        Solution5382 solution5382 = new Solution5382();
        assertEquals("& is an HTML entity but &ambassador; is not.",
                solution5382.entityParser("&amp; is an HTML entity but &ambassador; is not."));

        assertEquals("and I quote: \"...\"",
                solution5382.entityParser("and I quote: &quot;...&quot;"));

        assertEquals("Stay home! Practice on Leetcode :)",
                solution5382.entityParser("Stay home! Practice on Leetcode :)"));

        assertEquals("x > y && x < y is always false",
                solution5382.entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));

        assertEquals("leetcode.com/problemset/all",
                solution5382.entityParser("leetcode.com&frasl;problemset&frasl;all"));

    }
}

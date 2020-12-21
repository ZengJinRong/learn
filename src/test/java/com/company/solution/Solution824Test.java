package com.company.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution824Test {
    private static Solution824 solution824 = new Solution824();

    @Test
    void toGoatLatin() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", solution824.toGoatLatin("I speak Goat Latin"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                solution824.toGoatLatin("The quick brown fox jumped over the lazy dog"));
        assertEquals("Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa",
                solution824.toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }
}

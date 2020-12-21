package com.company.temp;

import com.company.solution.Solution5345;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5345Test {
    private static Solution5345 solution5345 = new Solution5345();

    @Test
    void rankTeams() {
        assertEquals("ACB", solution5345.rankTeams(new String[]{"ABC", "ACB", "ABC", "ACB", "ACB"}));
        assertEquals("XWYZ", solution5345.rankTeams(new String[]{"WXYZ", "XYZW"}));
        assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK", solution5345.rankTeams(new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
        assertEquals("ABC", solution5345.rankTeams(new String[]{"BCA", "CAB", "CBA", "ABC", "ACB", "BAC"}));
        assertEquals("M", solution5345.rankTeams(new String[]{"M", "M", "M", "M"}));
        assertEquals("VWFHSJARNPEMOXLTUKICZGYQ", solution5345.rankTeams(new String[]{"FVSHJIEMNGYPTQOURLWCZKAX", "AITFQORCEHPVJMXGKSLNZWUY", "OTERVXFZUMHNIYSCQAWGPKJL", "VMSERIJYLZNWCPQTOKFUHAXG", "VNHOZWKQCEFYPSGLAMXJIUTR", "ANPHQIJMXCWOSKTYGULFVERZ", "RFYUXJEWCKQOMGATHZVILNSP", "SCPYUMQJTVEXKRNLIOWGHAFZ", "VIKTSJCEYQGLOMPZWAHFXURN", "SVJICLXKHQZTFWNPYRGMEUAO", "JRCTHYKIGSXPOZLUQAVNEWFM", "NGMSWJITREHFZVQCUKXYAPOL", "WUXJOQKGNSYLHEZAFIPMRCVT", "PKYQIOLXFCRGHZNAMJVUTWES", "FERSGNMJVZXWAYLIKCPUQHTO", "HPLRIUQMTSGYJVAXWNOCZEKF", "JUVWPTEGCOFYSKXNRMHQALIZ", "MWPIAZCNSLEYRTHFKQXUOVGJ", "EZXLUNFVCMORSIWKTYHJAQPG", "HRQNLTKJFIEGMCSXAZPYOVUW", "LOHXVYGWRIJMCPSQENUAKTZF", "XKUTWPRGHOAQFLVYMJSNEIZC", "WTCRQMVKPHOSLGAXZUEFYNJI"}));
    }
}

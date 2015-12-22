package org.adventofcode.day5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeVowelsRuleTest {

    private StringRule threeVowels;

    @Before
    public void setUp() throws Exception {
        threeVowels = new ThreeVowelsRule();
    }

    @After
    public void tearDown() throws Exception {
        threeVowels = null;
    }

    @Test
    public void testApply1() throws Exception {
        assertTrue(threeVowels.apply("aei"));
    }

    @Test
    public void testApply2() throws Exception {
        assertTrue(threeVowels.apply("xazegov"));
    }

    @Test
    public void testApply3() throws Exception {
        assertTrue(threeVowels.apply("aeiouaeiouaeiou"));
    }

    @Test
    public void testDoesNotContainThreeVowels() throws Exception {
        assertFalse(threeVowels.apply("charles"));
    }

    @Test
    public void testNoVowels() throws Exception {
        assertFalse(threeVowels.apply("myntr"));
    }
}
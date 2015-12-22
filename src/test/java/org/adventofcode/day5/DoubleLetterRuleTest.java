package org.adventofcode.day5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 27975700819 on 22/12/15.
 */
public class DoubleLetterRuleTest {

    private StringRule doubleLetterRule;
    public static final String NON_REPEATING_STRING = "amnjuytreaq";
    public static final String REPEATING_STRING = "amnjuyyreaq";

    @Before
    public void setUp() throws Exception {
        doubleLetterRule = new DoubleLetterRule();
    }

    @After
    public void tearDown() throws Exception {
        doubleLetterRule = null;
    }

    @Test
    public void testApply() throws Exception {
        assertTrue(doubleLetterRule.apply(REPEATING_STRING));
    }

    @Test
    public void testNonRepeatingText() throws Exception {
        assertFalse(doubleLetterRule.apply(NON_REPEATING_STRING));
    }
}
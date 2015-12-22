package org.adventofcode.day5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringVerifierTest {

    private StringVerifier verifier;
    public static final String TEXT_ONE = "ugknbfddgicrmopn";
    public static final String TEXT_TWO = "jchzalrnumimnmhp";
    public static final String TEXT_THREE = "haegwjzuvuyypxyu";
    public static final String TEXT_FOUR = "dvszwmarrgswjxmb";

    @Before
    public void setUp() throws Exception {
        verifier = new StringVerifier();
    }

    @After
    public void tearDown() throws Exception {
        verifier = null;
    }

    @Test
    public void testValidString() throws Exception {
        StringQualifier expected = StringQualifier.NICE;

        StringQualifier actual = verifier.verify(TEXT_ONE);

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidString1() throws Exception {
        StringQualifier expected = StringQualifier.NAUGHTY;

        StringQualifier actual = verifier.verify(TEXT_TWO);

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidString2() throws Exception {
        StringQualifier expected = StringQualifier.NAUGHTY;

        StringQualifier actual = verifier.verify(TEXT_THREE);

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidString3() throws Exception {
        StringQualifier expected = StringQualifier.NAUGHTY;

        StringQualifier actual = verifier.verify(TEXT_FOUR);

        assertEquals(expected, actual);
    }

}
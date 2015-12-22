package org.adventofcode.day5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NotAllowedStringsRuleTest {

    private StringRule notAllowedStrings;
    public static final String ALLOWED_STRING = "aseffvcsssxsa";
    public static final String NOT_ALLOWED_STRING = "sedfghjhxysdd";

    @Before
    public void setUp() throws Exception {
        notAllowedStrings = new NotAllowedStringsRule();
    }

    @After
    public void tearDown() throws Exception {
        notAllowedStrings = null;
    }

    @Test
    public void testAllowedString() throws Exception {
        assertFalse(notAllowedStrings.apply(ALLOWED_STRING));
    }

    @Test
    public void testNotAllowedString() throws Exception {
        assertTrue(notAllowedStrings.apply(NOT_ALLOWED_STRING));
    }

}
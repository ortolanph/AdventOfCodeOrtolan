package org.adventofcode.day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ElvishWrappingPaperTest {

    private ElvishWrappingPaper elvishWrappingPaper;
    private static final String PRISM_1 = "2x3x4";
    private static final String PRISM_2 = "1x1x10";

    @Before
    public void setUp() throws Exception {
        elvishWrappingPaper = new ElvishWrappingPaper();
    }

    @After
    public void tearDown() throws Exception {
        elvishWrappingPaper = null;
    }

    @Test
    public void testWrapPrism1() throws Exception {
        List<String> prisms = Arrays.asList(PRISM_1);

        int expected = 58;

        int actual = elvishWrappingPaper.totalWrap(prisms);

        assertEquals(expected, actual);
    }

    @Test
    public void testWrapPrism2() throws Exception {
        List<String> prisms = Arrays.asList(PRISM_2);

        int expected = 43;

        int actual = elvishWrappingPaper.totalWrap(prisms);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalPaper() throws Exception {
        List<String> prisms = Arrays.asList(PRISM_1, PRISM_2);

        int expected = 101;

        int actual = elvishWrappingPaper.totalWrap(prisms);

        assertEquals(expected, actual);
    }

    @Test
    public void testRibbonPrism1() throws Exception {
        List<String> prisms = Arrays.asList(PRISM_1);

        int expected = 34;

        int actual = elvishWrappingPaper.totalRibbon(prisms);

        assertEquals(expected, actual);
    }

    @Test
    public void testRibbonPrism2() throws Exception {
        List<String> prisms = Arrays.asList(PRISM_2);

        int expected = 14;

        int actual = elvishWrappingPaper.totalRibbon(prisms);

        assertEquals(expected, actual);
    }

    @Test
    public void testRibbonPrismTotal() throws Exception {
        List<String> prisms = Arrays.asList(PRISM_1, PRISM_2);

        int expected = 48;

        int actual = elvishWrappingPaper.totalRibbon(prisms);

        assertEquals(expected, actual);
    }
}
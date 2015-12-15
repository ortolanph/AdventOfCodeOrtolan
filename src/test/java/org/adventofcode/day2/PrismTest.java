package org.adventofcode.day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrismTest {
    private Prism prism;
    private static final String PRISM_1 = "2x3x4";
    private static final String PRISM_2 = "1x1x10";

    @Before
    public void setUp() throws Exception {
        prism = new Prism("2x3x4");
    }

    @After
    public void tearDown() throws Exception {
        prism = null;
    }

    @Test
    public void testNewPrism1() throws Exception {
        int expectedLength = 2;
        int expectedWidth = 3;
        int expectedHeight = 4;

        prism = new Prism(PRISM_1);

        assertNotNull(prism);
        assertEquals(expectedLength, prism.getLength());
        assertEquals(expectedWidth, prism.getWidth());
        assertEquals(expectedHeight, prism.getHeight());
    }

    @Test
    public void testCalculateArea1() throws Exception {
        int expected = 52;

        prism = new Prism(PRISM_1);

        int actual = prism.area();

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateFeetSlack1() throws Exception {
        int expected = 6;

        prism = new Prism(PRISM_1);

        int actual = prism.slack();

        assertEquals(expected, actual);
    }

    @Test
    public void testTotalWrappingPaperForPrism1() throws Exception {
        int expected = 58;

        prism = new Prism(PRISM_1);

        int actual = prism.area() + prism.slack();

        assertEquals(expected, actual);
    }

    @Test
    public void testNewPrism2() throws Exception {
        int expectedLength = 1;
        int expectedWidth = 1;
        int expectedHeight = 10;

        prism = new Prism(PRISM_2);

        assertNotNull(prism);
        assertEquals(expectedLength, prism.getLength());
        assertEquals(expectedWidth, prism.getWidth());
        assertEquals(expectedHeight, prism.getHeight());
    }

    @Test
    public void testCalculateArea2() throws Exception {
        int expected = 42;

        prism = new Prism(PRISM_2);

        int actual = prism.area();

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateFeetSlack2() throws Exception {
        int expected = 1;

        prism = new Prism(PRISM_2);

        int actual = prism.slack();

        assertEquals(expected, actual);
    }

    @Test
    public void testTotalWrappingPaperForPrism2() throws Exception {
        int expected = 43;

        prism = new Prism(PRISM_2);

        int actual = prism.area() + prism.slack();

        assertEquals(expected, actual);
    }

}
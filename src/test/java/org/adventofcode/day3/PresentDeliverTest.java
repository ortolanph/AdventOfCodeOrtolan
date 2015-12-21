package org.adventofcode.day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresentDeliverTest {

    private PresentDeliver presentDeliver;

    public static final String COURSE_ONE = ">";
    public static final String COURSE_TWO = "^>v<";
    public static final String COURSE_THREE = "^v^v^v^v^v";

    @Before
    public void setUp() throws Exception {
        presentDeliver = new PresentDeliver();
    }

    @After
    public void tearDown() throws Exception {
        presentDeliver = null;
    }

    @Test
    public void shouldDeliverInTwoHouses() throws Exception {
        long expected = 2;

        char[] course = COURSE_ONE.toCharArray();

        for(char step : course) {
            presentDeliver.moveTo(step);
        }

        long actual = presentDeliver.delivered();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDeliverInThreeHouses() throws Exception {
        long expected = 4;

        char[] course = COURSE_TWO.toCharArray();

        for(char step : course) {
            presentDeliver.moveTo(step);
        }

        long actual = presentDeliver.delivered();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDeliverInTwoHousesOnly() throws Exception {
        long expected = 2;

        char[] course = COURSE_THREE.toCharArray();

        for(char step : course) {
            presentDeliver.moveTo(step);
        }

        long actual = presentDeliver.delivered();

        assertEquals(expected, actual);
    }
}
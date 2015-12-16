package org.adventofcode.day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SphericalHousesTest {

    private SphericalHouses sphericalHouses;
    public static final String DIRECTION_SET_1 = ">";
    public static final String DIRECTION_SET_2 = "^>v<";
    public static final String DIRECTION_SET_3 = "^v^v^v^v^v";

    @Before
    public void setUp() throws Exception {
        sphericalHouses = new SphericalHouses();
    }

    @After
    public void tearDown() throws Exception {
        sphericalHouses = null;
    }

    @Test
    public void testDirectionSet1() throws Exception {
        long expected = 2;

        long actual = sphericalHouses.countSphericalHousesVisitedOnce(DIRECTION_SET_1);

        assertEquals(expected, actual);
    }

    @Test
    public void testDirectionSet2() throws Exception {
        long expected = 3;

        long actual = sphericalHouses.countSphericalHousesVisitedOnce(DIRECTION_SET_2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVisiteOnceNoHouse() throws Exception {
        long expected = 0;

        long actual = sphericalHouses.countSphericalHousesVisitedOnce(DIRECTION_SET_3);

        assertEquals(expected, actual);
    }
}
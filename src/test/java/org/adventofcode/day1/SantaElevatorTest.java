package org.adventofcode.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SantaElevatorTest {

    private SantaElevator santaElevator;

    @Before
    public void setUp() throws Exception {
        santaElevator = new SantaElevator();
    }

    @After
    public void tearDown() throws Exception {
        santaElevator = null;
    }

    @Test
    public void shouldGoGroundTest1() throws Exception {
        int expected = 0;

        int actual = santaElevator.go("(())");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoGroundTest2() throws Exception {
        int expected = 0;

        int actual = santaElevator.go("()()");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoFloorThreeTest1() throws Exception {
        int expected = 3;

        int actual = santaElevator.go("(((");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoFloorThreeTest2() throws Exception {
        int expected = 3;

        int actual = santaElevator.go("(()(()(");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoFloorThreeTest3() throws Exception {
        int expected = 3;

        int actual = santaElevator.go("))(((((");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBasementOneTest1() throws Exception {
        int expected = -1;

        int actual = santaElevator.go("())");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBasementOneTest2() throws Exception {
        int expected = -1;

        int actual = santaElevator.go("))(");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBasementThreeTest1() throws Exception {
        int expected = -3;

        int actual = santaElevator.go(")))");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBasementThreeTest2() throws Exception {
        int expected = -3;

        int actual = santaElevator.go(")())())");

        assertEquals(expected, actual);
    }
}
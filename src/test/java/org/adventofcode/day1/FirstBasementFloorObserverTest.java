package org.adventofcode.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBasementFloorObserverTest {

    private SantaElevator santaElevator;
    private FirstBasementFloorObserver floorObserver = new FirstBasementFloorObserver();

    @Before
    public void setUp() throws Exception {
        santaElevator = new SantaElevator();
        santaElevator.addFloorObserver(floorObserver);
    }

    @After
    public void tearDown() throws Exception {
        santaElevator = null;
        floorObserver = null;
    }

        @Test
    public void firstBasementPositionTest1() throws Exception {
        int expected = 1;

        santaElevator.addFloorObserver(floorObserver);
        santaElevator.go(")");
        int actual = floorObserver.getFirstBasementFirstPosition();

        assertEquals(expected, actual);
    }

    @Test
    public void firstBasementPositionTest2() throws Exception {
        int expected = 5;

        santaElevator.addFloorObserver(floorObserver);
        santaElevator.go("()())");
        int actual = floorObserver.getFirstBasementFirstPosition();

        assertEquals(expected, actual);
    }
}
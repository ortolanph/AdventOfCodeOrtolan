package org.adventofcode.day3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    public static final char SYMBOL_NORTH = '^';
    public static final char SYMBOL_EAST = '>';
    public static final char SYMBOL_SOUTH = 'v';
    public static final char SYMBOL_WEST = '<';
    public static final char SYMBOL_INVALID = 'I';

    @Test
    public void shouldBeDirectionNORTH() throws Exception {
        Direction expected = Direction.NORTH;

        Direction actual = Direction.fromSymbol(SYMBOL_NORTH);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeDirectionEAST() throws Exception {
        Direction expected = Direction.EAST;

        Direction actual = Direction.fromSymbol(SYMBOL_EAST);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeDirectionSOUTH() throws Exception {
        Direction expected = Direction.SOUTH;

        Direction actual = Direction.fromSymbol(SYMBOL_SOUTH);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeDirectionWEST() throws Exception {
        Direction expected = Direction.WEST;

        Direction actual = Direction.fromSymbol(SYMBOL_WEST);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeInvalidDirection() throws Exception {
        Direction.fromSymbol(SYMBOL_INVALID);
    }

}
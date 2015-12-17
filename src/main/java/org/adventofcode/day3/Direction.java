package org.adventofcode.day3;

public enum Direction {
    NORTH('^'),
    EAST('>'),
    SOUTH('v'),
    WEST('<');

    private char symbol;

    Direction(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static Direction fromSymbol(char symbol) {
        for(Direction direction : Direction.values()) {
            if(direction.getSymbol() == symbol) {
                return direction;
            }
        }

        throw new IllegalArgumentException(String.format("There is no symbol: [%s]", symbol));
    }
}

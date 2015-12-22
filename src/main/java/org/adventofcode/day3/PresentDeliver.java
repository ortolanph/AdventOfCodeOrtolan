package org.adventofcode.day3;

public class PresentDeliver {

    private Visitor santaClaus = new SantaClaus();

    private int y = 0;
    private int x = 0;

    public void moveTo(char step) {
        Direction direction = Direction.fromSymbol(step);
        Coordinate coordinate = parseCoordinate(direction);
        coordinate.accept(santaClaus);
    }

    private Coordinate parseCoordinate(Direction direction) {
        switch (direction) {
            case NORTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y++;
                break;
            case WEST:
                x--;
                break;
        }

        return new Coordinate(x, y);
    }

    public long delivered() {
        return santaClaus.visitedHouses();
    }

}

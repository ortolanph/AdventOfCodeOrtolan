package org.adventofcode.day3;

public interface Visitor {
    void visit(Coordinate coordinate);
    long visitedHouses();
}

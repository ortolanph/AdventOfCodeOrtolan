package org.adventofcode.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class SantaClaus implements Visitor {

    private Set<Coordinate> visitedHouses = new LinkedHashSet<>();

    public SantaClaus() {
        Coordinate zeroZero = new Coordinate(0,0);
        zeroZero.accept(this);
    }

    @Override
    public void visit(Coordinate coordinate) {
        visitedHouses.add(coordinate);
    }

    @Override
    public long visitedHouses() {
        return visitedHouses.stream().count();
    }
}

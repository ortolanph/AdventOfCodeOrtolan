package org.adventofcode.day3;

import java.util.*;

public class SphericalHouses {

    private Set<Integer> visitedHouses = new LinkedHashSet<>();
    private Set<Integer> alreadyVisitedHouses = new LinkedHashSet<>();
    private int x = 0;
    private int y = 0;

    private static final Integer FACTOR = 10000;

    public SphericalHouses() {
        visit(x, y);
    }

    public long countSphericalHousesVisitedOnce() {
        return visitedHouses.stream().count() - alreadyVisitedHouses.stream().count();
    }

    public long countVisitedHouses() {
        return visitedHouses.stream().count();
    }

    public long countVisitedHousesMoreThanOnce() {
        return alreadyVisitedHouses.stream().count();
    }

    public void deliverPresentTo(char step) {
        if (step != '\n') {
            Direction direction = Direction.fromSymbol(step);

            switch (direction) {
                case NORTH:
                    y++;
                    break;
                case EAST:
                    x++;
                    break;
                case SOUTH:
                    y--;
                    break;
                case WEST:
                    x--;
            }

            visit(x, y);
        }
    }

    private void visit(int x, int y) {
        Integer visitedHouse = hash(x, y);

        if(visitedHouses.contains(visitedHouse)) {
            alreadyVisitedHouses.add(visitedHouse);
        } else {
            visitedHouses.add(visitedHouse);
        }
    }

    private Integer hash(int x, int y) {
        return (x * FACTOR) + y;
    }
}

package org.adventofcode.day3;

import java.util.*;

public class SphericalHouses {

    private Set<Integer> visitedHouses = new LinkedHashSet<>();
    private Set<Integer> alreadyVisitedHouses = new LinkedHashSet<>();
    private int x = 0;
    private int y = 0;
    private int houses = 0;

    private static final Integer FACTOR = 10000;

    public SphericalHouses() {
        visit(x, y);
        houses++;
        System.out.printf("<polyline points=\"%d,%d ", 1000, 1000);
    }

    public long countSphericalHousesVisitedOnce() {
        return visitedHouses.stream().count() - alreadyVisitedHouses.stream().count();
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

            if(houses % 50 == 0) {
                System.out.println("\" style=\"fill:none;stroke:black\" />");
                System.out.print("<polyline points=\"");
            }
            System.out.printf("%d,%d ", (x*10) + 1000, (y*10) + 1000);

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

        houses ++;
    }

    private Integer hash(int x, int y) {
        return (x * FACTOR) + y;
    }


}

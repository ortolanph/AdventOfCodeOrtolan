package org.adventofcode.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SphericalHouses {

    private Map<Integer, Integer> deliveryMap = new HashMap<>();
    private int x = 0;
    private int y = 0;

    private static final Integer FACTOR = 10000;

    public long countSphericalHousesVisitedOnce(String directions) {
        deliverPresents(directions.toCharArray());
        System.out.println(deliveryMap.toString());
        return deliveryMap.entrySet().stream().filter(v -> v.getValue() == 1).count();
    }

    private void deliverPresents(char[] path) {
        visit(x, y);

        for(char step : path) {
            Direction direction = Direction.fromSymbol(step);

            switch (direction) {
                case NORTH:
                    y = y + 1;
                    break;
                case EAST:
                    x = x + 1;
                    break;
                case SOUTH:
                    y = y - 1;
                    break;
                case WEST:
                    x = x - 1;
            }

            visit(x, y);
        }
    }

    private void visit(int x, int y) {
        Integer visits = deliveryMap.get(hash(x, y));

        if(Objects.isNull(visits)) {
            deliveryMap.put(hash(x,y), 1);
        } else {
            deliveryMap.put(hash(x,y), visits + 1);
        }
    }

    private Integer hash(int x, int y) {
        return (x * FACTOR) + y;
    }


}

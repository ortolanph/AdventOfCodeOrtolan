package org.adventofcode.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class SantaElevator {
    private static char UP = '(';
    private FloorObserver observer;

    public int go(String direction) {
        char[] directions = direction.toCharArray();
        int floor = 0;
        int position = 0;

        for (char dir : directions) {
            if (dir == UP) {
                floor++;
            } else {
                floor--;
            }
            position++;

            notifyObserver(floor, position);
        }

        return floor;
    }

    private void notifyObserver(int floor, int position) {
        if(!Objects.isNull(observer)) {
            observer.reachedFloor(floor, position);
        }
    }

    public void addFloorObserver(FloorObserver observer) {
        this.observer = observer;
    }

    public static void main(String[] args) {
        SantaElevator elevator = new SantaElevator();

        FirstBasementFloorObserver floorObserver = new FirstBasementFloorObserver();

        elevator.addFloorObserver(floorObserver);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("day01input.txt"));

            String input = reader.readLine();

            System.out.println(elevator.go(input));
            System.out.println(floorObserver.getFirstBasementFirstPosition());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

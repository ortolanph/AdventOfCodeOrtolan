package org.adventofcode.day1;

public class FirstBasementFloorObserver implements FloorObserver {

    private int firstBasementFirstPosition;

    public void reachedFloor(int floor, int position) {
        if(floor == -1 && firstBasementFirstPosition == 0) {
            firstBasementFirstPosition = position;
        }
    }

    public int getFirstBasementFirstPosition() {
        return firstBasementFirstPosition;
    }
}

package org.adventofcode.day4;

public enum MiningMode {

    FIVE_ZEROES("00000"),
    SIX_ZEROES("000000");

    private final String mode;

    MiningMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }
}

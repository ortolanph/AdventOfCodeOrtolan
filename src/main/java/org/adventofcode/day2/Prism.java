package org.adventofcode.day2;

import java.util.List;

public class Prism {

    private final int length;
    private final int width;
    private final int height;

    public Prism(String softPrism) {
        String[] dimensions = softPrism.split("x");

        length = Integer.valueOf(dimensions[0]);
        width = Integer.valueOf(dimensions[1]);
        height = Integer.valueOf(dimensions[2]);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area() {
        return 2 * lxw() + 2 * lxh() + 2 * hxw();
    }

    private int lxw() {
        return length * width;
    }

    private int lxh() {
        return length * height;
    }

    private int hxw() {
        return height * width;
    }

    public int slack() {
        return Math.min(lxw(), Math.min(lxh(), hxw()));
    }
}

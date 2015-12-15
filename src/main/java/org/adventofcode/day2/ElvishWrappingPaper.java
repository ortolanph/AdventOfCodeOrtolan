package org.adventofcode.day2;

import java.util.List;

public class ElvishWrappingPaper {
    public int totalWrap(List<String> surrogatePrisms) {
        List<Prism> prisms = surrogatePrisms
                .stream()
                .forEach(s -> new Prism(s));

        return prisms.stream().forEach(p -> (p.area() + p.slack()));
        return 0;
    }

    public static void main(String[] args) {

    }

}

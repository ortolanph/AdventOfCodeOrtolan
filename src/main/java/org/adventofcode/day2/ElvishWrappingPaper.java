package org.adventofcode.day2;

import java.util.List;

public class ElvishWrappingPaper {
    public int totalWrap(List<String> surrogatePrisms) {
        List<Prism> prisms = surrogatePrisms
                .stream()
                .forEach(s -> Prism s);

        return prisms.stream().forEach(prism -> {prism.area() + prism.slack()});
    }

    public static void main(String[] args) {

    }

}

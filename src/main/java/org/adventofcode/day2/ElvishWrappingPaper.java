package org.adventofcode.day2;

import java.util.List;
import java.util.stream.Collectors;

public class ElvishWrappingPaper implements PrismConverter, PrismWrapCalculator, PrismRibbonCalculator {
    public int totalWrap(List<String> surrogatePrisms) {
        List<Prism> prisms = surrogatePrisms.stream().map(s -> convertToPrism(s)).collect(Collectors.toList());

        return prisms.stream().mapToInt(prism -> calculateWrappingPaperForPrism(prism)).sum();
    }

    public int totalRibbon(List<String> surrogatePrisms) {
        List<Prism> prisms = surrogatePrisms.stream().map(s -> convertToPrism(s)).collect(Collectors.toList());

        return prisms.stream().mapToInt(prism -> calculateRibbonForPrism(prism)).sum();
    }

    @Override
    public Prism convertToPrism(String softPrism) {
        return new Prism(softPrism);
    }

    @Override
    public int calculateWrappingPaperForPrism(Prism prism) {
        return prism.area() + prism.slack();
    }

    @Override
    public int calculateRibbonForPrism(Prism prism) {
        return prism.smallestPerimeter() + prism.volume();
    }
}
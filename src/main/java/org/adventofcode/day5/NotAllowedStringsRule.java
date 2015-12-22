package org.adventofcode.day5;

import java.util.Arrays;
import java.util.List;

public class NotAllowedStringsRule implements StringRule {

    private static final List<String> NOT_ALLOWED = Arrays.asList("ab", "cd", "pq", "xy");

    @Override
    public boolean apply(String text) {
        return NOT_ALLOWED.stream().filter(s -> text.contains(s)).count() > 0;
    }
}

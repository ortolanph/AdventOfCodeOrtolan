package org.adventofcode.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeVowelsRule implements StringRule {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');
    public static final int VOWELS_ALLOWED = 3;

    @Override
    public boolean apply(String text) {
        List<Character> chars = retrieveCharList(text);

        long vowels = chars.stream().filter(character -> VOWELS.contains(character)).count();

        return vowels >= VOWELS_ALLOWED;
    }

    private List<Character> retrieveCharList(String text) {
        char[] chars = text.toCharArray();
        List<Character> newList = new ArrayList<>();

        for(char c : chars) {
            newList.add(c);
        }

        return newList;
    }
}

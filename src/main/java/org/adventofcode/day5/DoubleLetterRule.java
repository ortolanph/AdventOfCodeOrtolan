package org.adventofcode.day5;

public class DoubleLetterRule implements StringRule {

    @Override
    public boolean apply(String text) {
        char[] chars = text.toCharArray();
        boolean foundRepetition = false;

        for(int i = 1; i < chars.length; i++) {
            foundRepetition = (chars[i - 1] == chars[i]);

            if(foundRepetition) {
                break;
            }
        }

        return foundRepetition;
    }
}

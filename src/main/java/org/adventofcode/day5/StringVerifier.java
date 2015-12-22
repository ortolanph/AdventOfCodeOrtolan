package org.adventofcode.day5;

public class StringVerifier {
    private StringRule threeVowels = new ThreeVowelsRule();
    private StringRule doubleLetter = new DoubleLetterRule();
    private StringRule notAllowed = new NotAllowedStringsRule();

    public StringQualifier verify(String text) {
        boolean hasThreeVowels = threeVowels.apply(text);
        boolean hasDoubleLetters = doubleLetter.apply(text);
        boolean hasNotAllowedStrings = notAllowed.apply(text);

        return ((hasThreeVowels && hasDoubleLetters) && (!hasNotAllowedStrings))? StringQualifier.NICE : StringQualifier.NAUGHTY;
    }
}

package org.adventofcode.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WrappingPaperCalculator {
    public static void main(String[] args) {
        ElvishWrappingPaper elvishWrappingPaper = new ElvishWrappingPaper();
        List<String> surrogatePrisms = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            System.getProperty("user.home") +
                                    System.getProperty("file.separator") +
                                    "adventofcode" +
                                    System.getProperty("file.separator") +
                                    "day02input.txt"));

            String line = null;

            while ((line = reader.readLine()) != null) {
                surrogatePrisms.add(line);
            }

            reader.close();

            int totalWrap = elvishWrappingPaper.totalWrap(surrogatePrisms);
            int totalRibbon = elvishWrappingPaper.totalRibbon(surrogatePrisms);

            System.out.printf("Total Wrapping paper: %s\n", totalWrap);
            System.out.printf("Total Ribbon: %s\n", totalRibbon);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

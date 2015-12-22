package org.adventofcode.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SphericalHousesDeliverWithRobotSanta {
    public static void main(String[] args) {
        PresentDeliver deliver1 = new PresentDeliver();
        PresentDeliver deliver2 = new PresentDeliver();

        List<Character> symbols = Arrays
                .asList(Direction.values())
                .stream()
                .map(direction -> direction.getSymbol())
                .collect(Collectors.toList());

        int oddEven = 1;

        try {
            FileInputStream stream = new FileInputStream(System.getProperty("user.home") +
                    System.getProperty("file.separator") +
                    "adventofcode" +
                    System.getProperty("file.separator") +
                    "day03input.txt");

            int byteRead = 0;

            while ((byteRead = stream.read()) != -1) {
                char step = (char)byteRead;

                if(symbols.contains(step)) {
                    if(oddEven % 2 == 1) {
                        deliver1.moveTo((char) byteRead);
                    } else {
                        deliver2.moveTo((char) byteRead);
                    }

                    oddEven++;
                }
            }

            stream.close();
            System.out.println(deliver1.delivered());
            System.out.println(deliver2.delivered());
            System.out.println(deliver1.delivered() + deliver2.delivered() - 1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

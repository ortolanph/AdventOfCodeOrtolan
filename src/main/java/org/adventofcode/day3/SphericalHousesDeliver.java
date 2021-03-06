package org.adventofcode.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SphericalHousesDeliver {
    public static void main(String[] args) {
        PresentDeliver deliver = new PresentDeliver();

        List<Direction> directions = Arrays.asList(Direction.values());
        List<Character> symbols = directions.stream().map(direction -> direction.getSymbol()).collect(Collectors.toList());

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
                    deliver.moveTo((char) byteRead);
                }
            }

            stream.close();
            System.out.println(deliver.delivered());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

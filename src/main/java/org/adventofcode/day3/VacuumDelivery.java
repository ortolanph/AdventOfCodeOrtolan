package org.adventofcode.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VacuumDelivery {
    public static void main(String[] args) {
        SphericalHouses sphericalHouses = new SphericalHouses();
        String gridPath = "";

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            System.getProperty("user.home") +
                                    System.getProperty("file.separator") +
                                    "adventofcode" +
                                    System.getProperty("file.separator") +
                                    "day03input.txt"));


            gridPath = reader.readLine();
            reader.close();

            long housesVisitedOnce  = sphericalHouses.countSphericalHousesVisitedOnce(gridPath);

            System.out.printf("Houses visited once: %d\n", housesVisitedOnce);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

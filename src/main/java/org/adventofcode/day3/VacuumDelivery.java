package org.adventofcode.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VacuumDelivery {
    public static void main(String[] args) {
        SphericalHouses sphericalHouses = new SphericalHouses();

        try {
            FileInputStream stream = new FileInputStream(
                    new File(System.getProperty("user.home") +
                            System.getProperty("file.separator") +
                            "adventofcode" +
                            System.getProperty("file.separator") +
                            "day03input.txt"));


            int direction;
            while ((direction = stream.read()) != -1) {
                sphericalHouses.deliverPresentTo((char) direction);
            }

            stream.close();

            System.out.println("\" style=\"fill:none;stroke:black\" />");

            long housesVisitedOnce = sphericalHouses.countSphericalHousesVisitedOnce();

            System.out.printf("Houses visited once: %d\n", housesVisitedOnce);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

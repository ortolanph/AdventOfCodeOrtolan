package org.adventofcode.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringChecker {
    public static void main(String[] args) {
        StringVerifier verifier = new StringVerifier();
        List<StringQualifier> qualifierList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            System.getProperty("user.home") +
                                    System.getProperty("file.separator") +
                                    "adventofcode" +
                                    System.getProperty("file.separator") +
                                    "day05input.txt"));

            String toCheck = "";

            while((toCheck = reader.readLine()) != null) {
                qualifierList.add(verifier.verify(toCheck));
            }

            reader.close();

            System.out.println(qualifierList.stream().filter(q -> q == StringQualifier.NICE).count());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

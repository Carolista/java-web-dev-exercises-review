package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class CharacterCountSuperBonus {

    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String quoteFromFile = "";
        try {
            File textFromFile = new File("src/org/launchcode/java/studios/countingcharacters/quote.txt");
            Scanner myReader = new Scanner(textFromFile);
            while (myReader.hasNextLine()) {
                quoteFromFile = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when trying to read quote from file.");
        }

        char[] charArray = quoteFromFile.toUpperCase().toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char letter : charArray) {
            if (alphabet.indexOf(letter) >= 0) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }
}

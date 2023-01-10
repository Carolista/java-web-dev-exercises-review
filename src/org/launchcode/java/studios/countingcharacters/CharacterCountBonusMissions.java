package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountBonusMissions {

    public static void main(String[] args) {

        // BONUS MISSION 1 - prompt user for a string
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string to count its characters: ");
        String userString = input.nextLine();

        // BONUS MISSION 3 - allow only alpha characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // BONUS MISSION 3 - make counts case-insensitive
        char[] charArray = userString.toUpperCase().toCharArray();

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

        input.close();

    }
}

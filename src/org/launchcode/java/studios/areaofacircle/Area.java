package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
            BONUS MISSION - Validate user input to ensure a positive double is used for calculating
            An inner while loop catches non-numbers with .hasNextDouble() and .next()
            The do/while loop itself catches negative numbers
        */
        double radius;
        do {
            System.out.println("Enter a positive number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a number! Try again: ");
                // Here's the tricky part — input.next() allows the user to try again for this loop
                // But it will also allow the scanner to advance past this loop if valid
                // so that it can be stored in the radius variable with input.nextDouble() below
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        // Call the static getArea() method directly on the Circle class without importing it
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        // Always close scanner at the end
        input.close();
    }
}

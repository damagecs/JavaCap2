/*
Calculate factorial of number
Java Chapter 2
*/

package com.company;

import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {

        Scanner myNumber = new Scanner(System.in);  // Create a Scanner object
        System.out.println("This will calculate factorial"); // Print info
        System.out.println("Enter a number: "); // Ask for number
// Check if number is an integer
        while (!myNumber.hasNextInt()) {
            System.out.println("The number entered is not an integer, please try again");
            myNumber.next();
        }

        Integer number = myNumber.nextInt();  // Read the number the user enters
// Calculate factorial
        int factorial = number;
        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial); // Output the factorial result of the entered number
    }
}

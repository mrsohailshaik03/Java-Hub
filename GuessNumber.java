package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int noOfGuesses = 1;  // Initialize the number of guesses

        Scanner sc = new Scanner(System.in);  // Scanner object to read user input
        Random r = new Random();  // Random object to generate random number
        int botInput = r.nextInt(10);  // Generate a random number between 0 and 9

        // Prompt user to guess the number
        System.out.println("Enter your expected value that bot has generated:- ");

        int userInput;  // Variable to store user's guess
        do {
            userInput = sc.nextInt();  // Read user input
            if (userInput < botInput) {
                noOfGuesses++;  // Increment the number of guesses
                System.out.println("Your Expected value is less than bot value!\nEnter another value:-");
            } else if (userInput > botInput) {
                noOfGuesses++;  // Increment the number of guesses
                System.out.println("Your Expected value is Greater than bot value!\nEnter another value:-");
            } else {
                // If user guesses correctly
                System.out.println("You are Right! Congrats");
                System.out.println("Your number of guesses is:- " + noOfGuesses);
            }
        } while (botInput != userInput);  // Loop until user guesses correctly
    }
}

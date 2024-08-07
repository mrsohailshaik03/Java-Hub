package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorByMe {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("-------------   WELCOME TO THE GAME    ---------------");

        // User's turn to input their choice
        System.out.println("It's Your Turn!\nEnter Your Value:\n0 for Rock\n1 for Paper\n2 for Scissors");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt(3);  // Read user input (0, 1, or 2)
        String userMove = "";
        // Assign user's move based on their input
        switch (userInput) {
            case 0 -> userMove = "Rock";
            case 1 -> userMove = "Paper";
            case 2 -> userMove = "Scissor";
            default -> System.out.println("You Have Entered Wrong value!!!");
        }
        System.out.println("You have chosen - " + userMove);

        // Bot's turn to randomly select a move
        Random random = new Random();
        int bot = random.nextInt(3);  // Generate a random number (0, 1, or 2)
        System.out.println(bot);  // Output the random number for debugging
        String botMove = "";
        // Assign bot's move based on the random number
        switch (bot) {
            case 0 -> botMove = "Rock";
            case 1 -> botMove = "Paper";
            case 2 -> botMove = "Scissor";
        }
        System.out.println("Bot has chosen - " + botMove);

        // Determine the result of the game
        if (userInput == bot) {
            System.out.println("Tie!!");
        } else if (userInput == 0 && bot == 1
                || userInput == 1 && bot == 2
                || userInput == 2 && bot == 0) {
            System.out.println("You LOSE!!!!!!!!");
        } else {
            System.out.println("You WIN!!!!!!");
        }
    }
}

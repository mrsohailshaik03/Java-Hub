package com.company;

import java.util.Scanner;

public class KiloToMile {
    public static void main(String[] args) {
        double Kms, Miles;  // Variables to store kilometers and miles

        Scanner sc = new Scanner(System.in);  // Scanner object to read user input
        System.out.println("Enter the number of kilometers:");  // Prompt user to enter kilometers
        Kms = sc.nextDouble();  // Read user input for kilometers

        Miles = Kms * 0.621371;  // Convert kilometers to miles using the conversion factor

        // Display the result
        System.out.println(Kms + " Kilometers is equal to " + Miles + " Miles");
    }
}

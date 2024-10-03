package com.index;
import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare the two numbers and find the largest
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the scanner
        scanner.close();
    }
}


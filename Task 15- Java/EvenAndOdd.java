package com.index;

public class EvenAndOdd {
	public static void main(String[] args) {
        // Define an array of integers
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Call the method to count even and odd numbers
        countEvenOdd(array);
    }

    // Method to count and print the number of even and odd integers in an array
    public static void countEvenOdd(int[] array) {
        int evenCount = 0; // To store count of even numbers
        int oddCount = 0;  // To store count of odd numbers

        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;  // Increment even count if the number is divisible by 2
            } else {
                oddCount++;   // Increment odd count otherwise
            }
        }

        // Print the results
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }

}

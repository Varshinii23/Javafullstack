package com.index;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];

        // Input: array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        // Reverse the array
        reverseArray(array);

        // Output: reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            // Swap the elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}

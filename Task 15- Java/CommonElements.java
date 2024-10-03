package com.index;

public class CommonElements {
	public static void main(String[] args) {
        // Define two integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Call the method to find common elements
        findCommonElements(array1, array2);
    }

    // Method to find and print common elements between two arrays
    public static void findCommonElements(int[] array1, int[] array2) {
        System.out.println("Common elements between the two arrays are: ");
        
        // Nested loop to compare each element of array1 with each element of array2
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; // Break to avoid printing duplicates if found
                }
            }
        }
    }

}

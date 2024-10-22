package com.index;
import java.util.LinkedList;
import java.util.Queue;

public class Queuemax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Create a queue and add elements
		        Queue<Integer> queue = new LinkedList<>();
		        queue.add(10);
		        queue.add(20);
		        queue.add(5);
		        queue.add(30);
		        queue.add(15);

		        // Find the maximum element in the queue
		        int max = findMax(queue);

		        // Print the maximum element
		        System.out.println("The maximum element in the queue is: " + max);
		    }

		    // Method to find the maximum element in the queue
		    public static int findMax(Queue<Integer> queue) {
		        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible value

		        // Iterate over each element in the queue
		        for (int num : queue) {
		            if (num > max) {
		                max = num; // Update max if a larger element is found
		            }
		        }
		        return max;
		    }
		}


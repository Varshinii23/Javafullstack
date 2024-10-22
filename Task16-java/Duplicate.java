package com.index;
import java.util.LinkedList;
import java.util.Queue;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a queue with some duplicate elements
		        Queue<Integer> queue = new LinkedList<>();
		        queue.add(1);
		        queue.add(2);
		        queue.add(3);
		        queue.add(2);
		        queue.add(4);
		        queue.add(3);
		        queue.add(5);

		        System.out.println("Original Queue: " + queue);

		        // Remove duplicates from the queue
		        removeDuplicates(queue);

		        // Print the modified queue
		        System.out.println("Queue after removing duplicates: " + queue);
		    }

		    // Method to remove duplicates without using HashSet
		    public static void removeDuplicates(Queue<Integer> queue) {
		        Queue<Integer> tempQueue = new LinkedList<>();

		        // Iterate through the original queue
		        while (!queue.isEmpty()) {
		            int element = queue.poll();  // Remove the front element

		            // Check if the element is already in tempQueue
		            if (!tempQueue.contains(element)) {
		                tempQueue.add(element);  // Add if not a duplicate
		            }
		        }

		        // Add all elements back to the original queue
		        queue.addAll(tempQueue);
		    }
		}


	
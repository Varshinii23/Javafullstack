package com.index;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a queue and add elements
		        Queue<Integer> queue = new LinkedList<>();
		        queue.add(1);
		        queue.add(2);
		        queue.add(3);
		        queue.add(4);
		        queue.add(5);
		        queue.add(6);

		        System.out.println("Original Queue: " + queue);

		        // Reverse the first half of the queue
		        reverseFirstHalf(queue);

		        // Print the modified queue
		        System.out.println("Modified Queue: " + queue);
		    }

		    // Method to reverse the first half of the queue
		    public static void reverseFirstHalf(Queue<Integer> queue) {
		        int size = queue.size();
		        int half = size / 2;

		        // Use a stack to reverse the first half
		        Stack<Integer> stack = new Stack<>();

		        // Push the first half elements into the stack
		        for (int i = 0; i < half; i++) {
		            stack.push(queue.poll());
		        }

		        // Add the reversed first half elements back into the queue
		        while (!stack.isEmpty()) {
		            queue.add(stack.pop());
		        }

		        // Move the second half elements to the back of the queue to maintain order
		        for (int i = 0; i < size - half; i++) {
		            queue.add(queue.poll());
		        }
		    }
		}



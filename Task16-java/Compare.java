package com.index;
import java.util.LinkedList;
import java.util.Queue;

public class Compare {

	public static void main(String[] args) {
		
		        // Create two queues
		        Queue<Integer> queue1 = new LinkedList<>();
		        Queue<Integer> queue2 = new LinkedList<>();

		        // Add elements to the first queue
		        queue1.add(1);
		        queue1.add(2);
		        queue1.add(3);

		        // Add elements to the second queue
		        queue2.add(1);
		        queue2.add(2);
		        queue2.add(3);

		        // Compare the two queues using equals() method
		        if (queue1.equals(queue2)) {
		            System.out.println("The queues are equal.");
		        } else {
		            System.out.println("The queues are not equal.");
		        }

		        // Modify one of the queues
		        queue2.add(4);

		        // Compare again after modification
		        if (queue1.equals(queue2)) {
		            System.out.println("The queues are equal.");
		        } else {
		            System.out.println("The queues are not equal.");
		        }
		    }
		}


	
package com.index;
import java.util.LinkedList;
import java.util.Queue;


public class Mergequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create two queues and add elements
		        Queue<Integer> queue1 = new LinkedList<>();
		        queue1.add(1);
		        queue1.add(2);
		        queue1.add(3);

		        Queue<Integer> queue2 = new LinkedList<>();
		        queue2.add(4);
		        queue2.add(5);
		        queue2.add(6);

		        // Merge the two queues
		        Queue<Integer> mergedQueue = mergeQueues(queue1, queue2);

		        // Print the merged queue
		        System.out.println("Merged Queue: " + mergedQueue);
		    }

		    // Method to merge two queues
		    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
		        Queue<Integer> result = new LinkedList<>(q1); // Add all elements from q1
		        result.addAll(q2); // Add all elements from q2
		        return result;
		    }
		}


	

package collections_snippet;

import java.util.PriorityQueue;

public class Queue_PriorityQueue_Snippet {

	public static void main(String[] args) {

		// Initialize the PriorityQueue
		PriorityQueue<String> queue = new PriorityQueue<String>();

		// Add elements to the queue
		queue.add("Jethalal");
		queue.add("Iyer");
		queue.add("Mehta");
		queue.add("Bhide");

		// Display elements in priority order
		System.out.println("Elements in the PriorityQueue:");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll()); // poll retrieves and removes the head of the queue
		}

	}

}

/*
 * 
 * Display Elements: Added a loop to poll elements from the queue, displaying
 * them in priority order (natural alphabetical order in this case).
 * 
 * Output Clarity: Added a descriptive message before printing the elements.
 * 
 * The elements are displayed in alphabetical order because PriorityQueue orders
 * elements based on their natural ordering when no custom comparator is
 * provided.
 */
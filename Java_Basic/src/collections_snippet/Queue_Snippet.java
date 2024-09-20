package collections_snippet;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Snippet {

	public static void main(String[] args) {

		// Initialize PriorityQueue
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("FACEBOOK");
		q1.add("WHATSAPP");
		q1.add("GOOGLE");
		q1.add("LINKEDIN");

		// Initialize ArrayDeque
		Queue<String> q2 = new ArrayDeque<>();
		q2.add("APPLE");
		q2.add("BANANA");
		q2.add("CHERRY");

		// Display elements in PriorityQueue
		System.out.println("PriorityQueue elements:");
		while (!q1.isEmpty()) {
			System.out.println(q1.poll()); // poll removes the head of the queue
		}

		// Display elements in ArrayDeque
		System.out.println("\nArrayDeque elements:");
		while (!q2.isEmpty()) {
			System.out.println(q2.poll()); // poll removes the head of the queue
		}

	}

}

/*
 * 
 * PriorityQueue: This is a queue that orders elements based on their natural
 * ordering or by a specified comparator.
 * 
 * ArrayDeque: This is a resizable array implementation of the Deque interface,
 * which can be used as a queue or a stack.
 * 
 * 
 * Type Parameter: Both PriorityQueue and ArrayDeque are declared with type
 * parameters to ensure type safety.
 * 
 * Adding Elements: The add() method is used to add elements to both queues.
 * 
 * Polling Elements: The poll() method retrieves and removes the head of the
 * queue, displaying the elements in the order they were processed.
 * 
 */
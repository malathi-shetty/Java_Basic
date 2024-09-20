package collections_snippet;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_ArrayDeque_Snippet {

	public static void main(String[] args) {
		// Initialize an ArrayDeque as a Queue
		Queue<String> q2 = new ArrayDeque<>();

		// Add elements to the queue
		q2.add("Apple");
		q2.add("Banana");
		q2.add("Cherry");

		// Display the elements in the queue
		System.out.println("Elements in the ArrayDeque:");
		for (String fruit : q2) {
			System.out.println(fruit);
		}

		// Remove an element from the queue
		String removed = q2.poll(); // poll retrieves and removes the head of the queue
		System.out.println("\nRemoved element: " + removed);

		// Display remaining elements
		System.out.println("Remaining elements in the ArrayDeque:");
		for (String fruit : q2) {
			System.out.println(fruit);
		}

	}

}

/*
 * 
 * Initialization: A Queue<String> is initialized using ArrayDeque.
 * 
 * Adding Elements: The add() method adds elements to the queue.
 * 
 * Displaying Elements: A for-each loop is used to iterate over and display the
 * elements in the queue.
 * 
 * Removing an Element: The poll() method retrieves and removes the head of the
 * queue, returning null if the queue is empty.
 * 
 * Remaining Elements: Another loop displays the elements left in the queue
 * after one has been removed.
 * 
 */

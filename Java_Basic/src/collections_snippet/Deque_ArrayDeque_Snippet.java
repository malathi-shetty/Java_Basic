package collections_snippet;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ArrayDeque_Snippet {

	public static void main(String[] args) {
		// Initialize an ArrayDeque as a Deque
		Deque<String> deque = new ArrayDeque<>();

		// Add elements to the Deque
		deque.add("Apple"); // Adds to the end
		deque.add("Banana"); // Adds to the end
		deque.add("Cherry"); // Adds to the end

		// Add elements to the front of the Deque
		deque.addFirst("Mango");
		deque.addFirst("Grapes");

		// Display the elements in the Deque
		System.out.println("Elements in the ArrayDeque:");
		for (String fruit : deque) {
			System.out.println(fruit);
		}

		// Remove elements from the Deque
		String removedLast = deque.removeLast(); // Removes from the end
		String removedFirst = deque.removeFirst(); // Removes from the front

		// Display removed elements
		System.out.println("\nRemoved from end: " + removedLast);
		System.out.println("Removed from front: " + removedFirst);

		// Display remaining elements
		System.out.println("\nRemaining elements in the ArrayDeque:");
		for (String fruit : deque) {
			System.out.println(fruit);
		}

	}

}

/*
 * 
 * Adding to Both Ends: Demonstrated how to add elements to the front of the
 * deque using addFirst().
 * 
 * Removing from Both Ends: Used removeFirst() and removeLast() to show how to
 * remove elements from both ends of the deque.
 * 
 * Output Clarity: Added print statements to clearly indicate which elements
 * were removed and to display the remaining elements.
 * 
 * ******
 * 
 * deque.add("Apple"); // Adds to the end
 * 
 * deque.add("Banana"); // Adds to the end
 * 
 * deque.add("Cherry"); // Adds to the end
 * 
 * mean that you are adding elements to the end of the deque. Here’s a
 * breakdown:
 * 
 * add() Method: The add() method adds the specified element to the end of the
 * deque (like the tail of a queue).
 * 
 * Order of Insertion: The elements will be stored in the order you add them.
 * So, in this case:
 * 
 * "Apple" is the first element.
 * 
 * "Banana" is added next and is placed after "Apple".
 * 
 * "Cherry" is added last and is placed after "Banana".
 * 
 * After executing these three add() operations, the deque would look like this:
 * 
 * 
 * Front -> Grapes (if added first)
 * 
 * Mango (if added first)
 * 
 * Apple
 * 
 * Banana
 * 
 * Cherry <- Back
 * 
 * Summary:
 * 
 * Using add() simply appends elements to the end of the deque.
 * 
 * If you were to iterate over the deque, you would retrieve the elements in the
 * order they were added: first "Apple", then "Banana", and finally "Cherry".
 * 
 * 
 */

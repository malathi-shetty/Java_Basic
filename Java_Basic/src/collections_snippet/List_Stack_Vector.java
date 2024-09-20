package collections_snippet;

import java.util.Iterator;
import java.util.Stack;

public class List_Stack_Vector {

	public static void main(String[] args) {
		// Initialize a Stack
		Stack<String> stack = new Stack<String>();

		// Push elements onto the stack
		stack.push("ABC");
		stack.push("XYZ");

		// Pop the top element from the stack
		stack.pop();

		// Create an iterator to traverse the stack
		Iterator<String> itr = stack.iterator();

		// Print remaining elements in the stack
		System.out.println("Remaining elements in the stack:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

/*
 * 
 * Pushing and Popping: The push() method adds elements to the top of the stack,
 * and pop() removes the top element.
 * 
 * Iterator: The iterator is used to traverse through the elements of the stack.
 * After popping, only the last pushed element ("ABC") will remain in the stack.
 * 
 * Output Clarity: I've added a descriptive print statement before the loop to
 * make the output clearer. This indicates that after pushing "ABC" and "XYZ"
 * and popping "XYZ", only "ABC" remains in the stack.
 * 
 */

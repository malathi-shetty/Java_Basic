package collections_snippet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet_Snippet {

	public static void main(String[] args) {
		// Initialize a HashSet
		HashSet<String> set = new HashSet<>();

		// Add elements to the HashSet
		set.add("FACEBOOK");
		set.add("WHATSAPP");
		set.add("GOOGLE");
		set.add("LINKEDIN");

		// Create an iterator to traverse the HashSet
		Iterator<String> itr = set.iterator();

		// Print elements in the set
		System.out.println("Elements in the HashSet:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

/*
 * 
 * Initialization: A HashSet is initialized to hold String values.
 * 
 * Adding Elements: The add() method is used to insert strings into the set.
 * Note that duplicates will be ignored (if any were added).
 * 
 * Iterator: An Iterator is created to traverse the set, allowing you to
 * retrieve each element.
 * 
 * Output: The elements are printed to the console. The order of the output may
 * vary, as HashSet does not guarantee any specific order.
 * 
 * basic operations with a HashSet, including adding elements and iterating
 * through the set. The use of an iterator allows for safe traversal of the
 * collection.
 */
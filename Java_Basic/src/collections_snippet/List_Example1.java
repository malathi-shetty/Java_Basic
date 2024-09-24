package collections_snippet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Example1 {

	public static void main(String[] args) {
		// Create an ArrayList
		List<String> arrayList = new ArrayList<>();

		/*
		 * // Adding elements arrayList.add("A"); arrayList.add("B");
		 * arrayList.add("C"); arrayList.add("D");
		 */
		// OR
		// Adding more elements for demonstration
		for (char c = 'A'; c <= 'Z'; c++) {
			arrayList.add(String.valueOf(c));
		}

		// Random access: retrieving elements by index
		System.out.println("ArrayList element at index 2: " + arrayList.get(2)); // Output: C

		// Measure time taken for random access
		long startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arrayList.get(18); // Accessing middle element
		}
		long endTime = System.nanoTime();
		System.out.println("Time taken for random access in ArrayList: " + (endTime - startTime) + " ns");
		System.out.println("ArrayList element at index 18: " + arrayList.get(18));

		System.out.println();
		// Create a LinkedList
		List<String> linkedList = new LinkedList<>();

		// Adding elements
		linkedList.add("X");
		linkedList.add("Y");
		linkedList.add("Z");
		linkedList.add("E");

		// oR
		// Adding elements
		/*
		 * for (char c = 'A'; c <= 'Z'; c++) { linkedList.add(String.valueOf(c)); }
		 */
		// Measure time taken for insertions
		startTime = System.nanoTime();
		linkedList.add(2, "M"); // Inserting at index 2
		endTime = System.nanoTime();
		System.out.println("Time taken for insertion in LinkedList: " + (endTime - startTime) + " ns");
		System.out.println("Adding in index 2 - LinkedList contents: " + linkedList);

		// Measure time taken for deletions
		startTime = System.nanoTime();
		linkedList.remove(2); // Removing element at index 2
		endTime = System.nanoTime();
		System.out.println("Time taken for deletion in LinkedList: " + (endTime - startTime) + " ns");
		System.out.println("Removing in index 2 - LinkedList contents: " + linkedList);

		// Display the contents of the lists
		System.out.println("ArrayList contents: " + arrayList);
		System.out.println("LinkedList contents: " + linkedList);

	}

}

/*
 * 
 * ArrayList:
 * 
 * Random Access: The get(index) method is used to retrieve an element at a
 * specific index, which is fast due to the underlying array structure.
 * 
 * Performance Measurement: The time taken for multiple random accesses is
 * measured to show how efficient it is.
 * 
 * 
 * LinkedList:
 * 
 * Insertions and Deletions: The add(index, element) method is used to insert an
 * element at a specific index, and the remove(index) method is used to delete
 * an element at a specific index.
 * 
 * Performance Measurement: The time taken for insertion and deletion is
 * measured to demonstrate that these operations are typically faster in a
 * LinkedList than in an ArrayList for large lists.
 * 
 * collection type: ArrayList for random access and LinkedList for frequent
 * insertions and deletions.
 * 
 */
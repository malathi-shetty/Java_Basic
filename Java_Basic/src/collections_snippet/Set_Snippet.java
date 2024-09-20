package collections_snippet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Snippet {

	public static void main(String[] args) {
		// HashSet: unordered and allows null values
		Set<String> s1 = new HashSet<>();
		s1.add("Apple");
		s1.add("Banana");
		s1.add("Cherry");
		s1.add("null"); // String "null"
		s1.add("null"); // Duplicate, will not be added
		s1.add(" "); // Space character
		s1.add(" "); // Duplicate space, will not be added
		s1.add("Banana"); // Duplicate, will not be added

		System.out.println("HashSet (unordered): " + s1);

		// LinkedHashSet: maintains insertion order
		Set<String> s2 = new LinkedHashSet<>();
		s2.add("Apple");
		s2.add("Banana");
		s2.add("Cherry");
		s2.add("Banana"); // Duplicate, will not be added
		s2.add("null"); // String "null"
		s2.add("null"); // Duplicate, will not be added
		s2.add(" "); // Space character
		s2.add(" "); // Duplicate space, will not be added

		System.out.println("LinkedHashSet (insertion order): " + s2);

		// TreeSet: ordered by natural ordering or a specified comparator
		Set<String> s3 = new TreeSet<>();
		s3.add("Banana");
		s3.add("Apple");
		s3.add("Cherry");
		s3.add("Banana"); // Duplicate, will not be added
		s3.add("null"); // String "null"
		s3.add("null"); // Duplicate, will not be added
		s3.add(" "); // Space character
		s3.add(" "); // Duplicate space, will not be added

		System.out.println("TreeSet (sorted order): " + s3);

	}

}

/*
 * 
 * HashSet:
 * 
 * Characteristics: Unordered, does not guarantee the order of elements. Does
 * not allow duplicate values.
 * 
 * Performance: Provides constant time complexity for basic operations (add,
 * remove, contains) on average.
 * 
 * When you run this code, you might see output similar to the following (note
 * that the order in HashSet will vary)
 * 
 * Output: The output may appear unordered since HashSet does not maintain any
 * order.
 * 
 * Duplicates: Adding "null" and space (" ") multiple times will not cause
 * duplicates; only one instance of each will be kept.
 * 
 * Example Output: HashSet (unordered): [null, Apple, Banana, Cherry, ]
 * 
 * 
 * LinkedHashSet:
 * 
 * Characteristics: Maintains the order of elements as they are inserted. Like
 * HashSet, it does not allow duplicates.
 * 
 * Performance: Slightly slower than HashSet due to the overhead of maintaining
 * the order.
 * 
 * Output: Maintains the insertion order, so the elements will appear in the
 * order you added them.
 * 
 * Duplicates: Similar to HashSet, duplicates are ignored.
 * 
 * Example Output: LinkedHashSet (insertion order): [Apple, Banana, Cherry,
 * null, ]
 * 
 * 
 * TreeSet:
 * 
 * Characteristics: Stores elements in a sorted order, either according to their
 * natural ordering or by a specified comparator. Does not allow duplicates.
 * 
 * Performance: Operations such as add, remove, and contains take logarithmic
 * time.
 * 
 * Output: This will be sorted according to natural ordering (alphabetical order
 * in this case).
 * 
 * Duplicates: As with the other sets, duplicates are ignored. However, "null"
 * and space will affect the sorting.
 * 
 * Example Output: TreeSet (sorted order): [ , Apple, Banana, Cherry, null]
 * 
 * Note that "null" is treated as a string, and spaces are sorted before
 * alphabetical characters.
 * 
 */
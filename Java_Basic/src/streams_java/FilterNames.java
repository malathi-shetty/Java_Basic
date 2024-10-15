package streams_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {

	public static void main(String[] args) {
		// List of names
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Aaron", "David");

		// Filter names starting with 'A'
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

		// Print the filtered names
		System.out.println("Names starting with 'A': " + filteredNames);

	}

}

/*
 * 
 * Stream Operations:
 * 
 * stream(): Convert the list to a stream.
 * 
 * filter(): Use a lambda expression to filter names that start with "A".
 * 
 * collect(): Collect the filtered results back into a list.
 * 
 */

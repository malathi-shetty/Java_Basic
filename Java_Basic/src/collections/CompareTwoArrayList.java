package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		// 1. First approach sort and then equals

		// Creating ArrayList using Arrays.asList method

		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("Selenium", "Playwright", "Cypress", "Katalon"));
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("Selenium", "ACCELQ", "Cypress", "Playwright"));
		ArrayList<String> al3 = new ArrayList<String>(Arrays.asList("Katalon", "Cypress", "Selenium", "Playwright"));

		// Sorting elements using Collections.sort method
		Collections.sort(al1);
		Collections.sort(al2);
		Collections.sort(al3);

		// Printing after sorting the both ArrayList Elements
		System.out.println("After sorting al1: " + al1);
		System.out.println("After sorting al2: " + al2);
		System.out.println("After sorting al3: " + al3);

		// Comparing if both ArrayList elements are equals
		System.out.println("Compare al1 with al2: " + al1.equals(al2));
		System.out.println("Compare al2 with al3: " + al2.equals(al3));
		System.out.println("Compare al1 with al3: " + al1.equals(al3));

		// Removes from this list all of its elements that are contained in the
		// specified collection.
		al1.removeAll(al2);
		System.out.println("List which is not common in al1 & al2: " + al1);

		// Retains only the elements in this list that are contained in the specified
		// collection.
		al1.retainAll(al2);
		System.out.println("List retained after removing in al1 & al2: " + al1);

		

		// al2.removeAll(al1);
		// System.out.println("List which is not common in al1 & al2: " + al2);
		
		al2.retainAll(al1);
		System.out.println("List retained after removing in al1 & al2: " + al2);

	}

}

// NOTE:

//try either 1 for difference al1.removeAll(al2); or al2.removeAll(al1);

// comment al1.removeAll(al2); & then check al1.retainAll(al2);

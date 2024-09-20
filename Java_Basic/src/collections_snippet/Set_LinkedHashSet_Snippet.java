package collections_snippet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet_Snippet {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();

		// Add elements to the HashSet
		set.add("FACEBOOK");
		set.add("WHATSAPP");
		set.add("GOOGLE");
		set.add("LINKEDIN");

		// Create an iterator to traverse the LinkedHashSet
		Iterator<String> itr = set.iterator();

		// Print elements in the set
		System.out.println("Elements in the LinkedHashSet:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

package collections_snippet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_TreeSet_Snippet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();

		// Add elements to the HashSet
		set.add("FACEBOOK");
		set.add("WHATSAPP");
		set.add("GOOGLE");
		set.add("LINKEDIN");

		// Create an iterator to traverse the LinkedHashSet
		Iterator<String> itr = set.iterator();

		// Print elements in the set
		System.out.println("Elements in the TreeSet:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

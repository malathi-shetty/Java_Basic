package collections_snippet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Example {

	public static void main(String[] args) {
		 List<String> arrayList = new ArrayList<>();
		 List<String> linkedList = new LinkedList<>();
		
		  // arrayList is good for random access
	        arrayList.add("A");
	        arrayList.add("B");
	        arrayList.add("C");
	        System.out.println("ArrayList element at index 1: " + arrayList.get(1)); // Output: B

	        // linkedList is good for insertions & deletions
	        linkedList.add("X");
	        linkedList.add("Y");
	        linkedList.add("Z");
	        System.out.println("LinkedList element at index 1: " + linkedList.get(1)); // Output: Y
	}

}


/*

ArrayList: Suitable for random access because it uses an underlying array, allowing for fast retrieval times.

LinkedList: Better for frequent insertions and deletions as it consists of nodes that point to each other, making such operations faster.

*/
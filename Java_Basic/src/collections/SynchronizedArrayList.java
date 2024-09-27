package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//converting ArrayList to synchronized ArrayList using Collections.synchronizedList method
		List<String> synList = Collections.synchronizedList(new ArrayList<>());
		
		// Adding elements
		synList.add("Rajeev");
		synList.add("Leena");
		synList.add("Mickey");
		
		 // Retrieving elements with explicit synchronization
		synchronized (synList) {
			Iterator<String> it = synList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}

	}

}

/*
 * 
 * Synchronized List Creation: You create a synchronized list using Collections.synchronizedList(), which wraps a regular ArrayList to make it thread-safe.

Adding Elements: You add some string elements to the synchronized list.

Retrieving Elements: When iterating over the synchronized list, you wrap the iteration in a synchronized block to ensure thread safety.

ArrayList: A resizable array implementation of the List interface.

Collections: A utility class that contains static methods for operating on collections (like lists).

List: An interface that represents a collection of elements.


        List<String> synList = Collections.synchronizedList(new ArrayList<String>());

Creating a Synchronized List:

You create an ArrayList and wrap it in a synchronized list using Collections.synchronizedList(). 

This makes synList thread-safe, meaning multiple threads can operate on it without causing inconsistent states.



synList.add("Rajeev");
        synList.add("Leena");
        synList.add("Mickey");

Adding Elements: You add three string elements to the synchronized list

 synchronized (synList) {
 
 Synchronization Block: This line begins a synchronized block that locks synList for safe access. 
 This is necessary when iterating over the list to ensure that no other thread modifies it while you're reading.


  Iterator<String> it = synList.iterator();
  
            while(it.hasNext())
            
            {
                System.out.println(it.next());
            }
            
 Iterating Through the List: Inside the synchronized block:

An Iterator is created for synList.

A while loop checks if there are more elements (it.hasNext()) and prints each element using it.next().           

End of Synchronized Block: This closes the synchronized block, releasing the lock on synList.


Thread-Safety: By wrapping the ArrayList in a synchronized list, you ensure that any modifications or accesses to synList are thread-safe. This prevents issues like concurrent modifications, which can lead to exceptions or inconsistent data.

Explicit Synchronization: When retrieving elements, you explicitly synchronize access to the list to avoid problems if other threads try to modify it at the same time.


Use Cases

This approach is particularly useful in multi-threaded applications where lists might be accessed or modified by multiple threads simultaneously, ensuring data integrity and consistency.

*/
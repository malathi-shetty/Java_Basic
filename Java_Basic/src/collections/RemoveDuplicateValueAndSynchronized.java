package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateValueAndSynchronized {

	public static void main(String[] args) {
		
		//Creating ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,5,2,3,2,1,7,8,9,8,7));
		
		//using LinkedHashSet class to remove duplicate value from the ArrayList
		LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<Integer>(numbers);
		
		//now convert unique value from the linkedHashSet to ArrayList
		ArrayList<Integer> uniqueHashSetValue = new ArrayList<Integer>(uniqueNumbers);
		
		//Iterating the value using Iterator interface
		Iterator<Integer> it = uniqueHashSetValue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}

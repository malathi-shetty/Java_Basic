package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class Syntax_Of_Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		// Obtain an iterator from the collection
		Iterator<Integer> iterator = list.iterator();
		
		// Iterate through the collection using the iterator
		while(iterator.hasNext())
		{
			Integer element = iterator.next();
			System.out.println(element);
		}

	}

}

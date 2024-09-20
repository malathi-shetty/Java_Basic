package collections_snippet;

import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Apple");
		al.add("Mango");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

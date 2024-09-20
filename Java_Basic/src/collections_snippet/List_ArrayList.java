package collections_snippet;

import java.util.ArrayList;

public class List_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("SOUMYADIP");
		list.add("CODEWITH007");
		list.add("GOOGLE");
		list.add("LINKEDIN");
		
		 // Print the elements of the ArrayList
		System.out.println("Elements in the ArrayList:");
		for(String element: list)
		{
			System.out.println(element);
		}
	}

}

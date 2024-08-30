package comparatorANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test implements Comparable<Test> {
	
	//comparable is used for sorting purpose

	String name;
	int age;

	// One way of sorting based onn the age or bases on the Name you can sort
	// Constructor
	Test(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Test o) {
		 return this.name.compareTo(o.name); // Comparable method based on name
		// return Integer.compare(this.age, o.age);
	}

	@Override
	public String toString() {
		return ("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		ArrayList<Test> newobj = new ArrayList<>();
		 newobj.add(new Test("Apple", 50)); // based on keys & not on values
	        newobj.add(new Test("Mango", 6));

		Collections.sort( newobj);// Sorts based on the Comparable implementation

		for (Test k : newobj) {
			System.out.println(k);
		}

	}



}


/*
 * @Override
	public int compareTo(Test o) {
		 return this.name.compareTo(o.name); // Comparable method based on name
		// return Integer.compare(this.age, o.age);
	}
 * 
 * enable above at a time & check difference sorting based on keys & values
 * 
 * comparatorANDcomparator implements comparable interface
 * 
 *  it is used to sort the arrayList 
 *  
 * basically used for sorting age or name in compareTo method
 * 
 * compareTo is a method implemented in Comparable interface
 * 
 * 
 * comparatorANDcomparator is also an interface
 * 
 * filter based on age & name
 * 
 * 
 * 
 *
Class Test:

Implements Comparable<Test> so it can compare itself with other Test objects based on the name.
Constructor Initialization:

The constructor of Test initializes the name and age fields.
Comparison Implementation:

The compareTo method now correctly compares Test objects based on the name field.
Main Method:

Creates and sorts Test objects using their natural ordering defined by compareTo.





*/
package comparatorANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorCoding {

	private String Collegename;
	private int Collegeage;

	// One way of sorting based on the age or bases on the Name you can sort
	// Constructor
	public ComparatorCoding(int Collegeage, String Collegename) {
		this.Collegename = Collegename;
		this.Collegeage = Collegeage;
	}

	public String getCollegename() {
		return Collegename;
	}

	public int getCollegeage() {
		return Collegeage;
	}

	@Override
	public String toString() {
		return ("College_Name: " + Collegename + ", College_Age: " + Collegeage);
	}

	public static void main(String[] args) {
		ArrayList<ComparatorCoding> newobj1 = new ArrayList<>();
		newobj1.add(new ComparatorCoding(50, "Apple")); // based on keys & not on values
		newobj1.add(new ComparatorCoding(6, "Mango"));

		// Sort by College Name
		Collections.sort(newobj1, new CollegeNameComparator());

		System.out.println("Sorted by College Name:");
		for (ComparatorCoding k : newobj1) {
			System.out.println(k);
		}

		// Sort by College Age
		Collections.sort(newobj1, new CollegeAgeComparator());

		System.out.println("\nSorted by College Age:");
		for (ComparatorCoding k : newobj1) {
			System.out.println(k);
		}

	}

}

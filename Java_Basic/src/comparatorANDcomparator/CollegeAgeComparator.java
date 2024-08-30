package comparatorANDcomparator;

import java.util.Comparator;

public class CollegeAgeComparator implements Comparator<ComparatorCoding> {

	public int compare(ComparatorCoding o1, ComparatorCoding o2) {
		return Integer.compare(o1.getCollegeage(), o2.getCollegeage());
	}

}

/*
 * CollegeAgeComparator: This comparator sorts the ComparatorCoding objects
 * based on the college age (an int).
 */
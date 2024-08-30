package comparatorANDcomparator;

import java.util.Comparator;

public class CollegeNameComparator implements Comparator<ComparatorCoding> {

	@Override
	public int compare(ComparatorCoding o1, ComparatorCoding o2) {
		return o1.getCollegename().compareTo(o2.getCollegename());
	}
}

/*
 * CollegeNameComparator: This comparator sorts the ComparatorCoding objects
 * based on the college name (a String).
 * 
 */

/*
 * 01 > 02 = -1 01 < 02 = 1 01 = 02 = 0
 */
package collections_snippet;

import java.util.Iterator;
import java.util.Vector;

public class List_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Car");
		v.add("Bike");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

package collections;

import java.util.HashMap;

public class HashMap_Basic {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("vishal", 10);
		map.put("sachin", 20);
		map.put("vaibhav", 30);
		
		System.out.println("Size of the map is: " + map.size()); // Print size and content
		System.out.println("List all contents in key-value pair: " + map);
		
	/*	if(map.containsKey("vishal")) // Check if a key is present
		{
			Integer a = map.get("vishal");
			System.out.println("Value for key:" + " \"vishal\" is: " + a); // If present, print value

		}
		*/
		if(map.containsKey("ananya"))
		{
			Integer b = map.get("ananya");
			System.out.println("Value for key:" +"\"ananya\" is: " + b);// gets skip
		}
		
		if(map.containsKey("sachin"))
		{
			Integer c = map.get("sachin");
			System.out.println("Value for key:" +"\"sachin\" is: " + c);
		}
	
	
	}

}

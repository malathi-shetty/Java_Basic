package practice;

public class Person {
	
	//keep args as a non-static field, you can create an instance of Person in the main method:

	 String[] args = {"1","2"};
	public static void main(String[] args) {
		Person p = new Person();
		 System.out.println("Command-line args length: " + args.length);
	        System.out.println("Class-level args length: " + p.args.length);

	}

}


/*

String Array: You declare a String array named args with two elements: "1" and "2", but this array is not utilized in the main method.

Main Method: The main method receives its own args parameter, which represents command-line arguments. The length of this array is printed.

*/
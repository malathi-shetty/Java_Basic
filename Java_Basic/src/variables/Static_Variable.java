package variables;

public class Static_Variable {
	
	static int k = 50;

	public static void main(String[] args) {
		
		
		/*
		 * Static: same like instance but need to add a static keyword - outside method inside class
	* How to access static - With the help of class
	* Memory is allocated When class is created
	* 3 ways to access a static variable
		- Direct because main method is having static class
		- By class name
		- By object
*/

		Static_Variable sv = new Static_Variable();
		System.out.println("Static Variable by Object: " + sv.k);
		System.out.println("");
		
		System.out.println("Static Variable by Direct: " + k);
		System.out.println("");
		System.out.println("Static Variable by ClassName: " + Static_Variable.k);
		

	}

}

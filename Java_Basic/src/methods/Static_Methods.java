package methods;

public class Static_Methods {
	
	static void m1() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		
		/*
		 * Static method/variable is called by class name
		Whenever the class loads it will first check if any static methods/variables is present
		since Static related memory is allocated to class
*/
		
		Static_Methods.m1();
		

	}

}

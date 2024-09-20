package variables;

public class Static_Variable {

	/*
	 * Static: same as instance variables but need to add a static keyword - outside
	 * method inside class. How to access static variables: 
	 * 
	 * 1. Directly (in static context). 
	 * 
	 * 2. By class name. 
	 * 
	 * 3. By object (though it's not recommended and not required for static variables).
	 * 
	 */

	static int k = 50; // Static variable in the outer class

	// Static nested class
	public static class MyClass {
		static int staticVar; // Static variable in the nested static class

		public MyClass(int value) {
			MyClass.staticVar = value; // Initializing static variable
		}

		public static void display() {
			System.out.println("staticVar: " + staticVar); // Accessing static variable
		}
	}

	public static void main(String[] args) {

		Static_Variable sv = new Static_Variable();

		// Accessing the static variable 'k' in the outer class
		System.out.println("Static Variable by Object: " + sv.k);
		System.out.println("");

		// Accessing the static variable 'k' directly (in static context)
		System.out.println("Static Variable by Direct: " + k);
		System.out.println("");

		// Accessing the static variable 'k' by class name
		System.out.println("Static Variable by ClassName: " + sv.k);
		System.out.println("");

		// Using the static nested class
		Static_Variable.MyClass myClassInstance = new Static_Variable.MyClass(100);
		Static_Variable.MyClass.display(); // Accessing static method to print staticVar
	}

}

/*
 * 
 * Static Variable in Outer Class: k is a static variable of the outer class
 * Static_Variable. It can be accessed in three ways: through an instance of the
 * class, directly if you're in a static context, or using the class name.
 * 
 * Static Nested Class: The nested class MyClass is now declared as static,
 * which allows it to have static members and to access static members of the
 * outer class.
 * 
 * Static Variables and Methods: Static variables are shared across all
 * instances of the class and can be accessed directly via the class name.
 * Static methods can also access static variables directly.
 * 
 */
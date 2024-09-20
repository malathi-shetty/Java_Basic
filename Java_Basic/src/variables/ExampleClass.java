package variables;

public class ExampleClass {

	// create local ,static, instance variables
	
	// create static & instance method

	// **Instance Variable**: Variable associated with an instance of the class
	private int instanceVar;

	// **Static Variable**: Variable shared across all instances of the class
	private static int staticVar;

	// Constructor
	public ExampleClass(int instanceVar) {
		this.instanceVar = instanceVar; // Initialize instance variable
	}

	// **Instance Method**: Method that operates on an instance of the class
	public void instanceMethod() {
		// Local variable
		int localVar = 10;

		// Access and modify instance and static variables
		instanceVar += localVar;
		staticVar += localVar;

		// Print values
		System.out.println("Instance Variable: " + instanceVar);
		System.out.println("Static Variable: " + staticVar);
		System.out.println("Local Variable: " + localVar);
	}

	// **Static Method**: Method that operates at the class level, not on an
	// instance
	public static void staticMethod() {
		// Local variable
		int localVar = 20;

		// Access and modify static variable
		staticVar += localVar;

		// Print value
		System.out.println("Static Variable (from static method): " + staticVar);
		System.out.println("Local Variable: " + localVar);

		// Instance variables and methods cannot be accessed from static methods directly
		// 
		// Uncommenting the following line will cause a compilation error
		
		// System.out.println("Instance Variable: " + instanceVar); // Error
		
		// instanceMethod(); // Error
	}

	// Main method to run the example
	public static void main(String[] args) {
		ExampleClass obj1 = new ExampleClass(5);
		ExampleClass obj2 = new ExampleClass(10);

		obj1.instanceMethod(); // Instance method called on obj1
		obj2.instanceMethod(); // Instance method called on obj2

		ExampleClass.staticMethod(); // Static method called at the class level
	}
}


/*

Instance Variable (instanceVar):

Declared at the class level but outside of any methods.

Each instance of ExampleClass has its own copy of this variable.

Initialized through the constructor.

Static Variable (staticVar):




Also declared at the class level, but with the static keyword.

Shared across all instances of ExampleClass.

Initialized to 0 by default if not explicitly initialized.

Instance Method (instanceMethod):




Operates on instance variables.

Can access both instance and static variables.

Can also declare and use local variables within its body.

Static Method (staticMethod):



Operates at the class level, not on any specific instance.

Can only access static variables and call other static methods.

Cannot directly access instance variables or instance methods without creating an instance of the class.

Local Variable (localVar):



Declared inside methods (both instance and static methods).

Exists only within the scope of the method in which it is declared.

Must be initialized before use.

In the main method, we create instances of ExampleClass and call both instance and static methods to demonstrate how these variables and methods work.

*/
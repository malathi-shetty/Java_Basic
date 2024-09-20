package overload;

public class MyClass {

	public static void display() {
		System.out.println("No parameters");
	}

	public static void display(int x) {
		System.out.println("Integer parameter: " + x);
	}

	public static void display(String s) {
		System.out.println("String parameter: " + s);
	}

	public static void main(String[] args) {
		MyClass.display(); // Outputs: No parameters
		MyClass.display(10); // Outputs: Integer parameter: 10
		MyClass.display("Hello"); // Outputs: String parameter: Hello

	}

}

/*
 * The display() method is overloaded with different parameter lists: no
 * parameters, one integer parameter, and one string parameter.
 * 
 * When you call display(), the Java compiler determines which version of the
 * method to call based on the arguments you pass.
 * 
 */
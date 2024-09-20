package constructor;

public class Constructors_Test {

	// No-argument constructor
	Constructors_Test() {
		this(10); // Calls the parameterized constructor with the value 10
		System.out.println("first");
	}

	// Parameterized constructor
	Constructors_Test(int a) {
		System.out.println("second");
	}

	public static void main(String[] args) {
		Constructors_Test newobj = new Constructors_Test(); // Calls the no-argument constructor
	}

}
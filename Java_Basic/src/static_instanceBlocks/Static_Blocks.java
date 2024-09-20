package static_instanceBlocks;

public class Static_Blocks {

	// Static variable
	static int counter;

	// Static block for initialization
	static {
		System.out.println("Static block executed");
		counter = 10; // Initialize static variable
	}

	public static void main(String[] args) {
		System.out.println("Main method executed");
		System.out.println("Counter: " + counter);
	}
}

/*
 * Static Block Execution:
 * 
 * The static block is executed when the Example class is loaded by the JVM.
 * This happens before the main method is called.
 * 
 * The output will include "Static block executed" because the static block is
 * run during class loading.
 * 
 * 
 * Static Variable Initialization:
 * 
 * The static block initializes the counter variable to 10. This initialization
 * happens once when the class is loaded.
 * 
 * 
 * Main Method Execution:
 * 
 * After the static block has executed, the main method runs. It prints the
 * value of counter, which was initialized by the static block.
 * 
 */
package finalVariables;

public class Final_Variables {
	
	public static void main(String[] args) {
		
		//create a final variable
		final int AGE = 32;
		
		// try to change the final variable
		
		AGE = 45; // a compilation error with the following message. - The final local variable AGE cannot be assigned. It must be blank and not using a compound assignment
		System.out.println("Age: " + AGE);
	}

}

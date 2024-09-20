package variables;

public class Local_Variable {

	public static void main(String[] args) {
		// Local: variables declared inside a method, main method or constructor
		// Memory assigned - when we create a method, memory is allocated
		
		int i = 100;
		System.out.println(i);
		someMethod();
	}
	
	public static void someMethod() {
	    int localVar = 10;  // local variable
	    System.out.println("localVar: " + localVar);
	}


}


package variables;

public class Instance_Variable {
	
	/*
	 * Instance:  outside the method inside the class
		* By creating an object we can access instance variable
		* How to create an object of a class: June newObj = new June();
		* when we create an object, memory is allocated
*/
	
	int b=10;

	public static void main(String[] args) {
		
		Instance_Variable iv = new Instance_Variable();
		System.out.println(iv.b);

		
	}

}

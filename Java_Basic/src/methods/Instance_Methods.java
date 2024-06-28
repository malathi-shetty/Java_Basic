package methods;

public class Instance_Methods {
	
	void m2() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		/*
		 * By creating an object we have to access instance method
		Memory is allocated when object is created

*/
		
		Instance_Methods im = new Instance_Methods();
		im.m2();

	}

}

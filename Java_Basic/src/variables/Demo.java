package variables;

public class Demo {

	/***
	 * Local Variable ***
	 * 
	 * public void method() { int localVar = 10; // Local variable
	 * System.out.println(localVar); }
	 **/

	/***
	 * Instance Variable ***
	 * 
	 * 
	 * int instanceVar; // Instance variable
	 * 
	 * public void setVar(int value) { instanceVar = value; }
	 * 
	 * public void display() { System.out.println(instanceVar); }
	 */

	/* Static Variable */

//	static int k = 100;
	
//	`staticVar` is a static variable. It is shared across all instances of `Demo`, 
	//and changes made by `obj1` or `obj2` affect the shared `staticVar`.
	
	 static int staticVar; // Static variable

	    public void setVar(int value) {
	        staticVar = value;
	    }

	    public void display() {
	        System.out.println(staticVar);
	    }

	public static void main(String[] args) {
		
		Demo obj1 = new Demo(); 
		Demo obj2 = new Demo();
		
		obj1.setVar(10);
        obj1.display(); // Output: 10
        
        obj2.setVar(20);
        obj2.display(); // Output: 20

        // Accessing static variable using class name
        System.out.println(Demo.staticVar); // Output: 20


	/*	System.out.println(k); // direct

		System.out.println(Demo.k); // by class name

		Demo obj1 = new Demo();
		System.out.println(obj1.k); // by object
*/
		/*
		 * Instance Variable Demo obj1 = new Demo(); Demo obj2 = new Demo();
		 * 
		 * // Here, `instanceVar` is an instance variable. `obj1` and `obj2` have
		 * different 
		 * // values for `instanceVar`. obj1.setVar(10); obj1.display(); //
		 * Output: 10
		 * 
		 * obj2.setVar(20); obj2.display(); // Output: 20
		 * 
		 */

		/***
		 * Local Variable
		 * 
		 * int i = 100; System.out.println(i);
		 * 
		 * Demo obj = new Demo(); obj.method(); // Here, `localVar` is a local variable
		 * within the `method()`.
		 * 
		 */
	}
}
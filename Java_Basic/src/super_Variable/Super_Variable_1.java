package super_Variable;

public class Super_Variable_1 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box1();  // This is an example of polymorphism
	//	Box1 b3 = new Box(); -- This will not compile -Will show error since child cannot call object of Parent Class
		Box1 b4 = new Box1();
		
		System.out.println("b1:");
		b1.display(); //  (from Box's height & color)
		System.out.println(" ");
		System.out.println("b2:");
		b2.display();
		System.out.println(" ");
		System.out.println("b4:");
		b4.display(); // This calls the display() method from the Box1 class.

	}

}

/* Use of Super Keyword is to access super class instance variable from child class
 * 
 * 
 * Box1 b3 = new Box();
- You cannot assign an object of a superclass to a variable of the subclass type (e.g., Box1 b3 = new Box();), 
because the subclass might expect additional properties or methods not present in the superclass object.
*/
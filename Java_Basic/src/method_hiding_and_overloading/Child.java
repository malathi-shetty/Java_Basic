package method_hiding_and_overloading;

public class Child extends Parent {

	// Hides the m1 method in Parent
	static void m1(int a, int b) {
		System.out.println("Child m1: " + a + " and " + b);
	}

	public static void main(String[] args) {
		// Calling static methods using the class name
		Parent.m1(1, 2); // Output: Parent m1: 1 and 2
		Child.m1(3, 4); // Output: Child m1: 3 and 4

		// Static method calls are resolved at compile-time based on the reference type
		Parent p = new Child();
		p.m1(5, 6); // Output: Parent m1: 5 and 6 (resolved by reference type)

		Parent p1 = new Parent();
		p1.m1(10, 12); // Output: Parent m1: 10 and 12

		Child c = new Child();
		c.m1(20, 22); // Output: Child m1: 20 and 22
	}
}

/*
 * 
 * Static Method Definition and Hiding:
 * 
 * In Parent, you have a static method m1(int a, int b) that prints
 * "Parent m1: " followed by the parameters.
 * 
 * In Child, you redefine m1(int a, int b) with a different implementation that
 * prints "Child m1: " followed by the parameters.
 * 
 * This is an example of method hiding, not overriding. Static methods belong to
 * the class, not instances, so hiding is resolved based on the class type used
 * at compile-time, not the object type.
 * 
 * Method Calls in main:
 * 
 * Parent.m1(1, 2);: This calls the static method m1 defined in Parent. Output
 * is "Parent m1: 1 and 2".
 * 
 * Child.m1(3, 4);: This calls the static method m1 defined in Child. Output is
 * "Child m1: 3 and 4".
 * 
 * Parent p = new Child();: Although p is a reference of type Parent, the method
 * p.m1(5, 6) calls the static method from Parent, not Child. Static methods are
 * resolved at compile-time based on the reference type. Output is
 * "Parent m1: 5 and 6".
 * 
 * Parent p1 = new Parent();: This is straightforward. p1.m1(10, 12) calls the
 * static method in Parent. Output is "Parent m1: 10 and 12".
 * 
 * Child c = new Child();: c.m1(20, 22) calls the static method in Child. Output
 * is "Child m1: 20 and 22".
 * 
 * Summary Static Method Hiding: When a static method is defined with the same
 * name in both parent and child classes, it hides the parent’s static method.
 * The method called depends on the reference type, not the object type.
 * 
 * Compile-Time Resolution: Static methods are resolved based on the reference
 * type at compile-time, not at runtime.
 * 
 * In essence, method hiding is about which method is bound to the reference
 * type rather than the actual object type. This means that even if you create a
 * Child object, if you use a Parent reference to call the method, the Parent
 * version of the static method will be invoked.
 * 
 * 
 */
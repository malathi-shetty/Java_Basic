package overRide;

public class Test extends ChildClass {

	public static void main(String[] args) {
		ParentClass.staticMethod(); // Outputs: Static method in Parent
		ChildClass.staticMethod(); // Outputs: Static method in Child

		ParentClass p = new ChildClass();
		p.staticMethod(); // Outputs: Static method in Parent

	}

}

/*
 * 
 * Parent.staticMethod() calls the static method in the Parent class.
 * 
 * Child.staticMethod() calls the static method in the Child class. 
 * 
 * Even though p is of type Parent but refers to a Child object, p.staticMethod() calls the
 * Parent class's static method. This illustrates that static methods are
 * resolved based on the reference type, not the actual object type.
 * 
 */
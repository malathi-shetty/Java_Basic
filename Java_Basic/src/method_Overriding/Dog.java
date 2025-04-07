package method_Overriding;

public class Dog extends Animal {
	// Overriding the sound method in the subclass
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create an Animal object
		Animal myDog = new Dog(); // Create a Dog object (polymorphism)

		myAnimal.sound(); // Outputs: Animal makes a sound
		myDog.sound(); // Outputs: Dog barks
	}
}

/*
 * 
 * Definition: Method overriding occurs when a subclass provides a specific
 * implementation for a method that is already defined in its superclass. This
 * allows the subclass to modify or extend the behavior of the inherited method
 * 
 * Explanation:
 * 
 * The Animal class has a method sound().​
 * 
 * The Dog class extends Animal and overrides the sound() method to provide a
 * specific implementation.​
 * 
 * The @Override annotation indicates that the method is intended to override a
 * method in the superclass.​
 * 
 * 
 * At runtime, the method corresponding to the object's actual type is invoked
 * (dynamic method dispatch).​
 * 
 * Output:
 * 
 * Animal makes a sound
 * 
 * Dog barks
 * 
 * Key Points:
 * 
 * Method overriding is determined at runtime (runtime polymorphism).​
 * 
 * 
 * It requires inheritance; the subclass must inherit from the superclass.​
 * 
 * 
 * The method in the subclass must have the same name, return type, and
 * parameter list as the method in the superclass.​
 * 
 * The @Override annotation is optional but helps prevent errors by ensuring the
 * method correctly overrides a superclass method. ​
 */
package static_Keyword;
public class Static_Keyword {
	
	
	
	    static int staticCounter = 0;  // static variable
	    int instanceCounter = 0;  // instance variable

	    // Static method
	    static void incrementStaticCounter() {
	        staticCounter++;
	        System.out.println("Static Counter: " + staticCounter);
	    }

	    // Instance method
	    void incrementInstanceCounter() {
	        instanceCounter++;
	        System.out.println("Instance Counter: " + instanceCounter);
	    }

	public static void main(String[] args) {
		 // Accessing static method and variable without creating an object
		Static_Keyword.incrementStaticCounter(); // Static Counter: 1
		Static_Keyword.incrementStaticCounter(); // Static Counter: 2

        // Creating an object to access instance methods
		Static_Keyword newobj1 = new Static_Keyword();
		newobj1.incrementInstanceCounter(); // Instance Counter: 1
		newobj1.incrementInstanceCounter(); // Instance Counter: 2

        // Creating another object to show independent instance behavior
        Static_Keyword newobj2 = new Static_Keyword();
        newobj2.incrementInstanceCounter(); // Instance Counter: 1
    }

}

/*

The static keyword in Java is used to indicate that a particular member (variable, method, or block) belongs to the class rather than to any instance of the class. Static members can be accessed without creating an instance of the class.

The static variable staticCounter is shared by all instances of the class, so whenever we call StaticExample.incrementStaticCounter(), the value of staticCounter is updated.

The instance variable instanceCounter is specific to each instance of the class, so every object will have its own instanceCounter value.

*/
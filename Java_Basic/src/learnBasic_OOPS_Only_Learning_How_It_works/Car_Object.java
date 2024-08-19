package learnBasic_OOPS_Only_Learning_How_It_works;

public class Car_Object {
	
	public static void main(String[] args) {
		 // Create a new Car object
        Car_Class myCar = new Car_Class("Red", "Toyota Corolla", 2022);

        // Use the Car object to call methods
        myCar.displayDetails();  // Prints details of the car

        // Change the color using setter
        myCar.setColor("Blue");

        // Display updated details
        System.out.println("Updated car color: " + myCar.getColor());
        myCar.displayDetails();
    
    }

}

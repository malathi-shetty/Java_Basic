package Super_Constructor;

public class Super_Constructor {

	public static void main(String[] args) {

		 // Using Triangle1 object with Triangle reference (polymorphism)
        Triangle newobj = new Triangle1(); 
        System.out.println("Using newobj (Triangle1 with Triangle reference):");
        System.out.println("Height: " + newobj.height);
        System.out.println("Width: " + newobj.width);
        newobj.dimensions();
        newobj.heightval("The height in newobj is: ");
        
        System.out.println("");

        // Using Triangle1 object with Triangle1 reference
        Triangle1 newobj1 = new Triangle1();
        System.out.println("Using newobj1 (Triangle1 with Triangle1 reference):");
        System.out.println("Height: " + newobj1.height);
        System.out.println("Width: " + newobj1.width);
        newobj1.dimensions();
        newobj1.disp();

        System.out.println("");

        // Using Triangle object with Triangle reference
        Triangle newobj2 = new Triangle();
        System.out.println("Using newobj2 (Triangle with Triangle reference):");
        System.out.println("Height: " + newobj2.height);
        System.out.println("Width: " + newobj2.width);
        newobj2.dimensions();
        newobj2.heightval("The height in newobj2 is: ");

        System.out.println("");

        // Using ColoredTriangle object with Triangle reference
        Triangle newobj3 = new ColoredTriangle();
        System.out.println("Using newobj3 (ColoredTriangle with Triangle reference):");
        newobj3.heightval(); // Calls overridden method
        System.out.println("Height: " + newobj3.height);
        System.out.println("Width: " + newobj3.width);
        newobj3.dimensions();
        
        System.out.println("");
        
        // Using ColoredTriangle object with Triangle reference
        ColoredTriangle newobj6 = new ColoredTriangle();
        System.out.println("Using newobj3 (ColoredTriangle with ColoredTriangle reference):");
        newobj6.heightval(); // Calls overridden method
        newobj6.dimensions();
        System.out.println("");
        // Change color to Red
        newobj6.setColor("Red");
        System.out.println("After changing color to Red:");
        newobj6.heightval(); // Calls overridden method
        newobj6.dimensions();
        System.out.println("");
        // Change color to Blue
        newobj6.setColor("Blue");
        System.out.println("After changing color to Blue:");
        newobj6.heightval(); // Calls overridden method
        newobj6.dimensions();

        System.out.println("");

        // Using DetailedTriangle object
        DetailedTriangle newobj4 = new DetailedTriangle();
        System.out.println("Using newobj4 (DetailedTriangle object):");
        newobj4.heightval(); // Calls overridden method

        System.out.println("");

        // Using Triangle object with overloaded heightval method
        Triangle newobj5 = new Triangle();
        newobj5.heightval("The height of the triangle with parameters is - No need to iniliaze object here: ");
        
        System.out.println("");
        // Getting and printing the height value
        int height = newobj5.getHeight();
        System.out.println("The height obtained via getHeight method is: " + height);
        
        System.out.println("");
        Triangle_Details td = new Triangle_Details();
        
        
	}

}







/*
 * Additional Fields and Methods: Enhance the class with more fields and methods to provide more information.
Overriding: Modify the behavior of inherited methods in subclasses.
Parameters: Allow methods to accept parameters to customize behavior.
Return Values: Have methods return values instead of just printing.
Using super: Call superclass methods from subclasses and extend their functionality.
 * 
 * 
 * 
 * 
 */
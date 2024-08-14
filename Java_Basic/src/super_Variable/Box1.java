package super_Variable;

public class Box1 extends Box { // Child Class (Box1) extending Parent Class(Box)

	int height = 1000;  // This height is local to this main method, not affecting the class-level height.
	String color = "Green";
	
	public void display()
	{
		System.out.println("Box1 Class Height - Child: " + "Box Class Height - Super: " + height); // 1000  - refers to height in Box1, which shadows the Box height
		System.out.println("Box1 Class Color - Child: " + color);
		System.out.println("Box Class Height - Super: " + super.height); //900 - refers to height in Box (superclass)
		System.out.println("Box Class Color - Super: " + super.color); // Brown - refers to color in Box (superclass)
		
	}


}

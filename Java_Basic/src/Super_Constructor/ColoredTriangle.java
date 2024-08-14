package Super_Constructor;

public class ColoredTriangle extends Triangle{ // Subclass extending Triangle and overriding methods
	 String color = "Red";

	// Constructor to initialize different values
	    public ColoredTriangle() {
	        this.height = 800;
	        this.width = 400;
	        this.color = "Green"; // Default color
	    }
	    @Override
	    public void heightval() {
	        // Overridden method to include color
	        System.out.println("Height is: " + height + " and color is: " + color);
	    }
	    
	    @Override
	    public void dimensions() {
	        // Overriding dimensions method to include color
	        System.out.println("Height is: " + height + ", Width is: " + width + ", and color is: " + color);
	    }
	    
	    // Method to set the color
	    public void setColor(String color) {
	        this.color = color;
	    }

}

package Super_Constructor;

public class Triangle { // Parent class
	
	 int height = 900;
	    int width = 500;

	    Triangle(){ //  Super Class Constructor
	    	String name = "Shapes";
	    	System.out.println(name);
	    }
	    
	    // Method to return height value
	    public int getHeight() {
	        return height;
	    }

	    // Method to print height
	    public void heightval() {
	        System.out.println("Height is: " + height);  
	    }

	    // // Overloaded method to print height with an optional message
	    public void heightval(String message) {
	        System.out.println(message + height);
	    }

	    // Method to print width
	    public void widthval() {
	        System.out.println("Width is: " + width);
	    }

	    // Method to print both height and width
	    public void dimensions() {
	        System.out.println("Height is: " + height + ", Width is: " + width);
	    }
	
	
}
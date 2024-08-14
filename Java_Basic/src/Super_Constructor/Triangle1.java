package Super_Constructor;

public class Triangle1 extends Triangle { // Subclass extending Triangle

	 // Constructor to initialize different values
    public Triangle1() {
        this.height = 1200;
        this.width = 600;
    }

	  public void disp() {
	        super.heightval(); // Access the superclass method
	    }
}
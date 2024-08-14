package Super_Constructor;

public class DetailedTriangle extends Triangle { // Subclass extending Triangle and overriding methods
	// Constructor to initialize different values
	public DetailedTriangle() {
		this.height = 1500;
		this.width = 700;
	}

	@Override
	public void heightval() {
		// Call the superclass method
		super.heightval();
		// Additional functionality
		System.out.println("This triangle has a detailed description.");

	}

	@Override
	public void dimensions() {
		// Overriding dimensions method to add details
		System.out.println("Detailed dimensions - Height: " + height + ", Width: " + width);
	}

}

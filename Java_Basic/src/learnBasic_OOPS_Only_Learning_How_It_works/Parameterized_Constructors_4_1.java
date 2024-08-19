package learnBasic_OOPS_Only_Learning_How_It_works;

public class Parameterized_Constructors_4_1 {
	
	   int appId;
	   String appName;
	   int secondaryId; // Adding a new field to use 'j'

	    // Parameterized constructor with two parameters
	    public Parameterized_Constructors_4_1(int id, String name) {
	        this.appId = id;
	        this.appName = name;
	    }

	    // Additional constructor with three parameters
	    public Parameterized_Constructors_4_1(int i, int j, String name) {
	        this.appId = i; 
	        this.appName = name;
	        this.secondaryId = j; // Use 'j' to initialize a new field
	        //  this.appId = i + j; // Combine 'i' and 'j' to set appId
	      
	    }

	    void info() {
	        System.out.println("Id: " + appId + "," + " Name: " + appName);
	        if (secondaryId != 0) { // Display secondaryId if it's initialized
	            System.out.println("Secondary Id: " + secondaryId);
	        }
	    }
}

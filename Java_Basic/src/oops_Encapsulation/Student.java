package oops_Encapsulation;

public class Student {
	
	// instance variable
	 String name;
	 
	// Public getter method for Name
	public String getName() {
		return name;
	}

	// Public setter method for Name
	public void setName(String name) {
	 this.name = name;
		
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		
		 // Set the name using the setter method
		s.setName("Shaolin");
		
		 // Get the name using the getter method
		System.out.println(s.getName());

	}


	

}

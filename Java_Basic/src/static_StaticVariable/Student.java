package static_StaticVariable;

public class Student {
	
	int roll_number; // instance variable
	String name;
	
	static String college = "IIT"; // StaticVariable
	
	//constructor
	Student(int r, String n)
	{
		roll_number = r;
		name = n;
	}
	
	void display()
	{
		System.out.println(roll_number + ", " + name + ", " + college);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(555, "Alan");
		Student s2 = new Student(666, "Aliana");
		
		s1.display();
		s2.display();

	}

}

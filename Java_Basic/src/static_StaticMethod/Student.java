package static_StaticMethod;

public class Student {

	int roll_number; // instance variable
	String name;
	
	static String college = "IIT"; // Static Variable
	
	static void change() // Static Method
	{
		college = "IIM";
	}
	
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
		
		Student.change();
		Student s1 = new Student(555, "Alan");
		Student s2 = new Student(666, "Aliana");
		Student s3 = new Student(777, "Michael");
		
		s1.display();
		s2.display();
		s3.display();
		
	}
}

package constructor_parameterized;

public class Student {
	
	
		int id;
		String name;
		
	

	public Student(int i, String n) {
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student(111, "Ansh");
		Student s2 = new Student(222, "Aryan");
		
		s1.display();
		s2.display();
		
		

	}

}

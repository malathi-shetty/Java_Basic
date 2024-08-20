package constructor_overloading;

public class Student {
	
	int id;
	String name;
	int age;
	

	


	public Student(int i, String n) {
		id = i;
		name = n;
	}
	public Student(int i, String n, int j) {
		id = i;
		name = n;
		age = j;
	}
	
	void display()
	{
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	}


	public static void main(String[] args) {
		
		Student s1 = new Student(333, "Anshukha");
		Student s2 = new Student(444, "Anaya", 20);
		
		s1.display();
		s2.display();

	}

}

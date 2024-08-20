package constructor_overloading;

public class Student_1 {

	int id;
	String name;
	int age;

	// Constructor with id and name, age is defaulted to 0
	public Student_1(int i, String n) {
		id = i;
		name = n;
		age = 0; // Default value for age
	}

	// Constructor with id, name, and age
	public Student_1(int i, String n, int j) {
		id = i;
		name = n;
		age = j;
	}

	// Method to display student details
	void display() {
		// Print id and name
		System.out.print("ID: " + id + ", Name: " + name);

		// Conditionally print age if it's not the default value
		if (age != 0) {
			System.out.println(", Age: " + age);
		}
		// Print newline at the end
		System.out.println();
	}

	public static void main(String[] args) {
		// Creating Student objects
		Student_1 s1 = new Student_1(333, "Anshukha");
		Student_1 s2 = new Student_1(444, "Anaya", 20);

		// Displaying details of each student
		s1.display();
		s2.display();

	}

}

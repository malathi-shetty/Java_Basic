package oops_Encapsulation;

public class Student_1 {

	// Private instance variables
	private String name;
	private int age;
	private String subject;
	private String standard;

	// Public getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public static void main(String[] args) {
		// Create instances of Student
		Student_1 student1 = new Student_1();
		student1.setName("Shaolin");
		student1.setAge(3);
		student1.setSubject("English");
		student1.setStandard("Nursery");

		Student_1 student2 = new Student_1();
		student2.setName("Ravi");
		student2.setAge(10);
		student2.setSubject("Mathematics");
		student2.setStandard("5th Grade");

		Student_1 student3 = new Student_1();
		student3.setName("Priya");
		student3.setAge(7);
		student3.setSubject("Science");
		student3.setStandard("2nd Grade");

		// Print details of each student
		printStudentDetails(student1);
		printStudentDetails(student2);
		printStudentDetails(student3);
	}

	// Method to print student details
	public static void printStudentDetails(Student_1 student) {
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Subject: " + student.getSubject());
		System.out.println("Standard: " + student.getStandard());
		System.out.println(); // Print a blank line for readability
	
		// OR
		
	/*	 System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + 
                 ", Subject: " + student.getSubject() + ", Standard: " + student.getStandard());
                 */
}
	}



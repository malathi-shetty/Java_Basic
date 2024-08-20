package oops_Inheritance;

public class Programmer extends Employee {

	int bonus = 10000;
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		System.out.println("Salary of a Programmer is: " + p.Salary);
		System.out.println("Bonus of a Programmer is: " + p.bonus);
		

	}

}

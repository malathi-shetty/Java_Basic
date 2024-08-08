package oops_multipleInheritance;

public class Demo {

	public static void main(String[] args) {
		
		C obj = new C(); // creating object of class C
		obj.perform(); // execute() method is present in both class A and B - gets confused since it extends both A & B class

	}

}

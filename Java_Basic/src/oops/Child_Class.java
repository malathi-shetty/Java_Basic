package oops;

public class Child_Class extends Parent_Class {
	
	void m1()
	{
		super.m1();
		this.m2();
		System.out.println("Child Method");
	}
	
	void m2()
	{
		System.out.println("Child second Method");
	}

	public static void main(String[] args) {

	/*	Child_Class cc = new Child_Class();
		cc.m1();
		
		Parent_Class pc = new Parent_Class();
		pc.m1();
	*/	
		Parent_Class pc1 = new Child_Class();
		pc1.m1(); //instance class so child method wud print
		
		

	}

}

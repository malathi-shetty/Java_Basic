package overRide;

public class ChildClass extends ParentClass {
	
	static void m2()
	{
		System.out.println("Child static...");
	}

	static void m1()
	{
		System.out.println("Child Method...");
	}
	
	public static void staticMethod() {
        System.out.println("Static method in Child");
    }
	
	public static void main(String[] args) {
		
		
		ParentClass pc = new ChildClass();  // Parent Method.. is called
		ChildClass cc = new ChildClass(); // Child Method.. is called
		pc.m1(); 
		cc.m2(); 
	}
}
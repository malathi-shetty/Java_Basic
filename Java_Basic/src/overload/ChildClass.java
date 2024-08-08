package overload;

public class ChildClass extends ParentClass {
	
		static void m1(int a)
		{
			System.out.println("Child static...");
		}

		static void m1(int a, int b)
		{
			System.out.println("Child Method...");
		}
		
		public static void main(String[] args) {
			
			
		//	ParentClass pc = new ChildClass();  // Parent Method.. is called
			ChildClass cc = new ChildClass(); // Child Method.. is called
			
	//		pc.m1(); // Parent Method
	//		pc.m2(10);// Parent Static
			cc.m1(); // Parent Method
			cc.m2(40);// Parent Static
			cc.m1(10, 20); // Child Method - Provide an integer argument (for example, 10) since m1 & m2(Parameterized)
			cc.m1(30); // Child Static
		
	}
}
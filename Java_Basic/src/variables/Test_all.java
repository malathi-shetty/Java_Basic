package variables;

public class Test_all {
	
	static int k = 5;
	static void m1()
	{
		System.out.println("Static Method");
	}
	
	void m2()
	{
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		
		Test_all newobj = new Test_all(); // constructor
		
		System.out.println(Test_all.k); // static by classname
		
		m1(); // static by direct
		
		newobj.m1(); // static by object
		newobj.m2(); // Instance
	}
}
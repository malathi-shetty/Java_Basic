package interface_test;

public interface Testing {
	
	public int a = 10;
	static String k="p";
	
	final String ename ="d";
	
	abstract void m1();
	
	default void m2(){
	//	m4();  // Can call the private method
		System.out.println("hey Default");
	}
	
	static void m3(){
	//	m4();  // Can call the private method
		System.out.println("hi Static");
	}
	
/*	private static void m4() // update java library to support
	{
		
		System.out.println("hey private");
	}
	*/
}
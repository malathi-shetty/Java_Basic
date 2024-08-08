package method_overloading;

public class Parent_Mo {
	
	
/*	void m1()
	{
		System.out.println("a");
	}
	void m1(int a, String b)
	{
		System.out.println("b");
	}
	*/
	void m1(String a, int b )
	{
		String name ="hey";
		System.out.println("c");
	}
	void m1(int b, String a )
	{
		String name ="hey";
		System.out.println("e");
	}
	/*
	String m1(int a, int b )
	{
		String name ="hey";
		System.out.println("d");
		return name;
	}
*/
	public static void main(String[] args) {
		Parent_Mo newobj = new Parent_Mo();
		newobj.m1(2, "hi");
	}
}
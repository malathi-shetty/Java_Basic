package constructor;

public class ParentClass {
	
	
	static 
	{
		System.out.println("parent static blocks");
	}
	
	{
		System.out.println("parent instance blocks");
	}
	
	static void m1(){
		System.out.println("parent static method");
	}
	
	void m2(){
		System.out.println(" parent instance method");
	}

	ParentClass(){
		System.out.println("parent constructor");
	}
	ParentClass(int b){
		System.out.println("parent constructor1");
	}

}

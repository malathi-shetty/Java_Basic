package constructor;

public class ParentClass {
	
	
	static 
	{
		System.out.println("parent static static_instanceBlocks");
	}
	
	{
		System.out.println("parent instance static_instanceBlocks");
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

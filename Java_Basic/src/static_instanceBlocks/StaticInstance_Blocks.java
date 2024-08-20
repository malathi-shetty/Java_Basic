package static_instanceBlocks;

public class StaticInstance_Blocks {
	
	static {
		System.out.println("static static_instanceBlocks");
	}
	 {
			System.out.println("Instance static_instanceBlocks");
		} 
	 static void m1() {
		 System.out.println("static method");
	 }
	 
	 void m2() {
		 System.out.println("Instance method");
	 }
	 
	 StaticInstance_Blocks()
	 {
		 this(10);
		 System.out.println("Cconstr-10");
	 }
	 StaticInstance_Blocks(int a)
	 {
		 System.out.println("constr");
	 }
	public static void main(String[] args) {
		
		StaticInstance_Blocks sib = new StaticInstance_Blocks();
		StaticInstance_Blocks sib1 = new StaticInstance_Blocks();
		StaticInstance_Blocks sib2 = new StaticInstance_Blocks();
		
		StaticInstance_Blocks.m1();
		sib.m2();
		
	}

}

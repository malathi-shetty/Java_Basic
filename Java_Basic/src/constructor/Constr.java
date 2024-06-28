package constructor;

public class Constr extends ParentClass {
	
	Constr(){
		super(10);
		
		//this(10);
		System.out.println("Child cons");
	}
	
	Constr(int a){
		//super();
		System.out.println("Child cons1");
	}
	

	
	public static void main(String[] args) {	
		Constr con=new Constr();
		Constr con1=new Constr(10);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*void m1() {
		System.out.println("child static");
	}
	
	Constr(){ 
		this(10);
		System.out.println("cons");
	}
	
	Constr(int a){ 
		this(10,20);
		System.out.println("param cons");
	}
	
	Constr(int a, int b){ 
		System.out.println("second param cons");
	}

	public static void main(String[] args) {	
		Constr con=new Constr();

	}*/
}
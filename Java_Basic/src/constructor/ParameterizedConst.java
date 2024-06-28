package constructor;

public class ParameterizedConst {

	void m1() {
		System.out.println("child static");
	}
	
	ParameterizedConst(){
		this(10);
		System.out.println("cons");
	}
	
	ParameterizedConst(int a){
		System.out.println("param cons");
	}
	
	ParameterizedConst(int a, int b){
		System.out.println("second param cons");
	}
		
	public static void main(String[] args) {	
			ParameterizedConst pc=new ParameterizedConst();
			
		}


	}



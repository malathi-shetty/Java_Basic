package practice;

public class Practice {
	
	//class would be loaded first
	// then it would identify static static_instanceBlocks, static methods
	
	private static int k = 10;
	static { // static block would be executed once its loaded. 
		k++; // k would be incremented
	}

	public static void main(String[] args) {
		
		Practice p = new Practice();
		System.out.println(p.k); // static is not preffered to be called by object
		System.out.println(k);	
	}
}
package string_Methods_In_Java;

public class Empty {

	public static void main(String[] args) {
		
		String s1="";
		System.out.println(" s1 is empty: " + s1.isEmpty());
	//	System.out.println("s1 is blank: " + s1.isBlank()); // - supported in Java 11
		
		
		String s2=null;
		System.out.println(s2.isEmpty()); // java.lang.NullPointerException because s2 is null, and calling any method on a null object will cause this exception.

	}

}

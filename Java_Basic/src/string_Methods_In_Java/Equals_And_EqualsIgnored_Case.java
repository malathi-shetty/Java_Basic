package string_Methods_In_Java;

public class Equals_And_EqualsIgnored_Case {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));

	}

}

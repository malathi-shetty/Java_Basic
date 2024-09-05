package stringBuilder;

public class StringBuilder_concept1 {

	public static void main(String[] args) {
		
		
		StringBuilder s = new StringBuilder("Basic ");
		StringBuilder s1 = new StringBuilder(" Java ");
		System.out.print("s==s1: ");
		System.out.print(s==s1);
		
		System.out.println(" ");
		s.append(" Concept ");
		System.out.println("s: " + s);
		
		System.out.print("s==s1: ");
		System.out.print(s==s1);
		
		System.out.println(" ");
		System.out.println("s Equals s1: " + s.equals(s1));
		
		System.out.println("s content equals s1 content: " + s.toString().equals(s1.toString()));


	}

}

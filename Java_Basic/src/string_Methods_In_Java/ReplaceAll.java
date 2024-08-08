package string_Methods_In_Java;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String s1= "1 + 1 = 2";
		System.out.println(s1.replaceAll("\\d", "#")); //Remember to escape backslashes in regular expressions in Java strings (\\d for matching digits).

	}

}

package string_Methods_In_Java;

public class ToCharArray {

	public static void main(String[] args) {
		
		String s1="Hello";
		char[] charArray = s1.toCharArray(); //Converts this string to a new character array.
		for(char c: charArray)
		{
			System.out.println(c);
		}

	}

}

package string_Methods_In_Java;

public class Split {

	public static void main(String[] args) {
		
		String s1=" Java is fun";
		String[] words = s1.split(" ");
		for(String word: words)
		{
			System.out.println(word);
		}

	}

}

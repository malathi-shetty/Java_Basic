package coding;

public class Reverse_String {

	public static void main(String[] args) {
	
		String s ="Hey good girl";
		String[] words = s.split(" "); // give space in between
		
		String rev = "";
		
		for(String c: words)
		{
			for(int i=c.length()-1; i>=0; i--)
				{
					rev = rev + c.charAt(i) ;
				
				}
			rev = rev + " ";
		
			
	}
			System.out.println("Reverse words: " + rev);
	}

}

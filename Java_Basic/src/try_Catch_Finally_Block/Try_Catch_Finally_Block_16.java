package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_16 {

	public static void main(String[] args) {
		try
		{
			String s = "java";
			System.out.println(s.charAt(20));
			System.out.println(10/0);
		}catch(StringIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(10/0);
			System.out.println(e.getMessage());
		}finally
		{
			System.out.println("finally");			
		}
	}
}
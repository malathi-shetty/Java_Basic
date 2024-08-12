package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_17 {

	public static void main(String[] args) {
		try
		{
			String s = "malathi";
			System.out.println(s.charAt(20));
			System.out.println(10/0);
		}catch(StringIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally
		{
			System.out.println("finally");			
		}
	}
}
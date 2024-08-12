package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_18 {

	public static void main(String[] args) {
		try
		{
			Thread.sleep(2000); // Check commenting this InterruptedException will show error - compile time error
			String s = "malathi";
			System.out.println(s.charAt(20));
			//System.out.println(10/0); // it will still execute
		}catch(StringIndexOutOfBoundsException | ArithmeticException | InterruptedException e)
		//We can keep checked & unchecked Exceptions in Pipe
	//	If we remove Arithmetic Exception - no difference would be found on runtime 
	//	But if we remove Checked Exception we can see compile time error 
	//	So checkedException should always be found in Try-block then only u can declare it in catch block

		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}finally
		{
			System.out.println("finally");			
		}
	}
}
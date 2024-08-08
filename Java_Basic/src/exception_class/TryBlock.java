package exception_class;

public class TryBlock {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("E:" + e);
			
			System.out.println("Message: " + e.getMessage());
			
		}
		/*
		catch(ArrayIndexOutOfBoundsException e) // this would stop here & throw error
		{
			System.out.println("E:" + e);
		}
		*/
		catch(Exception e)
		{
			System.out.println("E:" + e);
			
			System.out.println("Message: " + e.getMessage());
			
		}
		System.out.println("code execution");

	}

}

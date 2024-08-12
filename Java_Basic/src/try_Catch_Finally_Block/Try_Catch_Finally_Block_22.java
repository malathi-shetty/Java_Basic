package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_22 {	
	void m2() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	void m1() throws InterruptedException
	{
		m2();
	}

	public static void main(String[] args) throws InterruptedException, ArithmeticException {

		Thread.sleep(2000);
		System.out.println(10 / 0);
		try {	
	//		System.out.println(10 / 0);
		}		
		catch(NullPointerException e)
		{
			System.out.println("catch");
		}finally
		{
			System.out.println("finally");
		}
	}
}
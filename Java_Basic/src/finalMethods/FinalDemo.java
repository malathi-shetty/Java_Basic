package finalMethods;

public class FinalDemo extends Final_Method {
	
	
	//try to override final method
	public final void display()
	
	
	
	
	
	{
		System.out.println("The final method is overridden...");
	}
	

	public static void main(String[] args) {
		
		FinalDemo fd = new FinalDemo();
		fd.display();
	}

}

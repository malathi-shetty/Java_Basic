package finalClass;


// try to extend the final class
public class JuneClass extends Final_Class {

	
	
	
	
		public void display()
		{
			System.out.println("The final method is overridden...");
		}

		public static void main(String[] args) {
			JuneClass jc = new JuneClass();
			jc.display();
	}

}

package exception_class;

public class Character_Exception {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/2);
			System.out.println("try");
			System.out.println("ratan".charAt(12)); // character in ratan is 5 but i am asking 12 charcter so exception is thrown
		}catch(ArithmeticException a)
		{
			System.out.println(a);
			System.out.println("code execution in catch");
		}catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
			System.out.println("code execution in catch1");
		}
		System.out.println("code execution...");
	}

}

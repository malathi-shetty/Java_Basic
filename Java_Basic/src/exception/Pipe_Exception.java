package exception;

public class Pipe_Exception {
	public static void main(String[] args) {
		
		
		try {
			System.out.println(10/2);
			System.out.println("try");
			System.out.println("sneaker".charAt(1));
		}
		catch(ArithmeticException | NumberFormatException | StringIndexOutOfBoundsException e){ // NumberFormatException - unchecked exception
			System.out.println("Exception occured " + e);
		}	
	}

}

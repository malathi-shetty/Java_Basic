package casting_Widening_Narrowing;

public class Casting_Narrowing {

	public static void main(String[] args) {
		// Converting larger type to a smaller type size
		// Must be done manually by placing the ype in paranthesis in front of the value
		// double - float - long - int - char - short - byte

		double MyDouble = 9.78d;
		System.out.println(MyDouble);

		int MyInt = (int) MyDouble;
		System.out.println(MyInt);

	}

}

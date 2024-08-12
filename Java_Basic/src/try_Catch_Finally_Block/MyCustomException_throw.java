package try_Catch_Finally_Block;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MyCustomException_throw {

	public static void main(String[] args) {
		try {
			validateAge(15); // This will throw MyCustomException

			// throw new InvalidProductException;
		} catch (MyCustomException e) {
			System.out.println("Caught exception: " + e.getMessage());

		}

		finally {
			System.out.println("finally");
		}
	}

	static void validateAge(int age) throws MyCustomException {
		if (age < 18) {
			throw new MyCustomException("Age must be 18 or older.");
		}
		System.out.println("Age is valid.");
	}
}
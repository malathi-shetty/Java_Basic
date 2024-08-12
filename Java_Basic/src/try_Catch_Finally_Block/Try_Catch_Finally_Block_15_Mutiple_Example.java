package try_Catch_Finally_Block;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Try_Catch_Finally_Block_15_Mutiple_Example {

	public static void main(String[] args)
			throws NumberFormatException, CloneNotSupportedException, ClassNotFoundException, IOException {
		System.out.println("**FileNotFoundException**");
		try {
			// FileNotFoundException
			FileReader fileReader = new FileReader("nonexistentfile.txt");

		} catch (FileNotFoundException e) {
			System.out.println("Caught FileNotFoundException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());

		} finally {
			System.out.println("Finally block executed");
		}

		System.out.println(" ");
		System.out.println("** EOFException & IOException **");
		try {
			// EOFException and IOException handling
			DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(new byte[] {}));
			dataInputStream.readByte(); // Attempt to read from empty stream
		} catch (EOFException e) {
			System.out.println("Caught IOException or EOFException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** SQLException **");
		try {
			// SQLException
			throw new SQLException("SQL Error");
		} catch (SQLException e) {
			System.out.println("Caught SQLException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** ClassNotFoundException **");
		try {
			// ClassNotFoundException
			Class.forName("com.example.NonExistentClass"); // Ensure this class does not exist
		} catch (ClassNotFoundException e) {
			System.out.println("Caught ClassNotFoundException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** CloneNotSupportedException **");
		try {
			// CloneNotSupportedException
			MyCloneNotSupportedObject myObject = new MyCloneNotSupportedObject();
			myObject.clone(); // Attempt to clone an object that doesn't support cloning
		} catch (CloneNotSupportedException e) {
			System.out.println("Caught CloneNotSupportedException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** NullPointerException **");
		try {
			// NullPointerException
			String nullString = null;
			System.out.println(nullString.length());

		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** ArrayIndexOutOfBoundsException **");
		try {
			// ArrayIndexOutOfBoundsException
			int[] array = new int[1];
			System.out.println(array[2]); // Access an invalid index

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** IndexOutOfBoundsException **");
		try {
			// IndexOutOfBoundsException
			List<String> list2 = new ArrayList<>();
			System.out.println(list2.get(1)); // Access an invalid index

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Caught IndexOutOfBoundsException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** StringIndexOutOfBoundsException **");
		try {
			// StringIndexOutOfBoundsException
			String text = "example";
			System.out.println(text.charAt(10)); // Access an invalid index in the string

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caught StringIndexOutOfBoundsException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** IllegalArgumentException **");
		try {
			// IllegalArgumentException
			Thread thread = new Thread();
			thread.setPriority(100); // Priority should be between Thread.MIN_PRIORITY and Thread.MAX_PRIORITY

		} catch (IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** ArithmeticException **");
		try {
			// ArithmeticException
			int result = 10 / 0; // Division by zero

		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** NumberFormatException **");
		try {
			// NumberFormatException
			int number = Integer.parseInt("invalid_number"); // Invalid number format

		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println(" ");
		System.out.println("** IllegalStateException **");
		try {
			// IllegalStateException
			throw new IllegalStateException("Illegal state");

		} catch (IllegalStateException e) {
			System.out.println("Caught IllegalStateException: " + e.getClass().getName());
			System.out.println("Message: " + e.getMessage());
		}

	}

	// Custom class to demonstrate CloneNotSupportedException
	static class MyCloneNotSupportedObject {
		@Override
		protected Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException("Clone operation not supported");
		}

	}

}

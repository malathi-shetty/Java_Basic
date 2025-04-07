package customException_Checked;

public class AgeValidator {
	 // Method that validates age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}

/*
 * 
 * In Java, custom exceptions allow you to handle specific error conditions in your application more effectively. You can create custom exceptions by extending the existing Exception class for checked exceptions or the RuntimeException class for unchecked exceptions. Below are examples of both approaches:
 * 
 * 
Creating a Checked Custom Exception
Checked exceptions are exceptions that are checked at compile-time. When you create a checked custom exception, methods that might throw this exception must declare it using the throws keyword.


Explanation:

The InvalidAgeException class extends the Exception class, making it a checked exception.​



The constructor of InvalidAgeException calls the superclass constructor with the provided error message.​

The validateAge method throws an InvalidAgeException if the provided age is less than 18.​

In the main method, we attempt to validate an age of 15, which triggers the exception.​


The catch block catches the exception and prints the error message.​

Output:

Exception caught: Age must be 18 or above.
*/
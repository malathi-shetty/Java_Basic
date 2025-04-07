package customException_Unchecked;

public class AgeValidator {
	// Method that validates age
    public static void validateAge(int age) {
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
Unchecked exceptions are exceptions that are not checked at compile-time, meaning methods are not required to declare them. They typically represent programming errors, such as logic mistakes or improper use of an API.

Explanation:

The InvalidAgeException class extends the RuntimeException class, making it an unchecked exception.​

The constructor of InvalidAgeException calls the superclass constructor with the provided error message.​

The validateAge method throws an InvalidAgeException if the provided age is less than 18.​

In the main method, we attempt to validate an age of 15, which triggers the exception.

The catch block catches the exception and prints the error message.

Output: Exception caught: Age must be 18 or above.

Key Points:

Checked Exceptions: Extend the Exception class and must be declared in the method's throws clause. They are typically used for recoverable conditions.​

Unchecked Exceptions: Extend the RuntimeException class and do not need to be declared in the throws clause. They are generally used for programming errors.​

Constructors: It's common practice to provide constructors that accept custom error messages and, optionally, cause exceptions. This allows for more informative exception handling.

*/


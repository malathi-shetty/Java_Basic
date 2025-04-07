package customException_Unchecked;

public class InvalidAgeException extends RuntimeException {
    // Constructor that accepts a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

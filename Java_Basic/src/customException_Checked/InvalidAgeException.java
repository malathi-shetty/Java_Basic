package customException_Checked;

public class InvalidAgeException extends Exception {
    // Constructor that accepts a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

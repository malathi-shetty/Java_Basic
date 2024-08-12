package try_Catch_Finally_Block;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class Try_Catch_Finally_Block_14_Mutiple_Pipe {

    public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException, IOException {

    	try {
            // FileNotFoundException
            FileReader fileReader = new FileReader("nonexistentfile.txt");
            System.out.println("FileNotFoundException : File Not Found Exception");
            

            // EOFException and IOException handling
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(new byte[] {}));
                dataInputStream.readByte(); // Attempt to read from empty stream
                System.out.println("FileNotFoundException : File Not Found Exception");
            } catch (IOException e) {
                System.out.println("Handled inside inner try block: " + e.getClass().getName());
                throw e; // Re-throw to be caught by the outer catch block
            }

            // SQLException
            throw new SQLException("SQL Error");

        } catch (FileNotFoundException | EOFException | SQLException | NullPointerException | ArrayIndexOutOfBoundsException
                | StringIndexOutOfBoundsException 
                | ArithmeticException | NumberFormatException | IllegalStateException
                 e) 
    	{ 
            // Handle multiple exceptions
            System.out.println("Caught exception: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        } finally {
            // This block will always be executed
            System.out.println("Finally block executed");
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

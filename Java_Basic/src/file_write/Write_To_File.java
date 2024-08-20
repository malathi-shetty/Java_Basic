package file_write;

import java.io.FileWriter;
import java.io.IOException;

public class Write_To_File {

	public static void main(String[] args) {
		try 
		{
			FileWriter myWrite = new FileWriter(System.getProperty("user.dir") +  "/src/file_write/Writefile.txt");
					myWrite.write("File is Java might be Tricky, but it is fun enough to do");
			myWrite.close();
			System.out.println("Successfully wrote to file");
		}catch(IOException e)
			{
			System.out.println("All error occured.");
			e.printStackTrace();
			}
		}

	}



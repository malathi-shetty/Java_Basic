package file_read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read_from_File {

	public static void main(String[] args) {
		
		try {
			File obj = new File(System.getProperty("user.dir") +  "/src/file_write/Writefile.txt");
			Scanner myReader = new Scanner(obj);
			while(myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
		}catch(FileNotFoundException e)
		{
			System.out.println("An error occured..");
			e.printStackTrace();
		}

	}

}

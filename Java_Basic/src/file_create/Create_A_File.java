package file_create;

import java.io.File;
import java.io.IOException;

public class Create_A_File {

	public static void main(String[] args) throws IOException {
		try {
		File myObj = new File(System.getProperty("user.dir") +  "/src/file_create/filename.txt");
		if(myObj.createNewFile())
		{
			System.out.println("File Created: " + myObj.getName());
		}else
		{
			System.out.println("File Already Exists");
		}

	}catch(IOException e)
		{
		System.out.println("All error occured.");
		e.printStackTrace();
		}
		
	}
}

package file_delete;

import java.io.File;

public class Delete_a_File {

	public static void main(String[] args) {
		File newobj = new File(System.getProperty("user.dir") +  "/src/file_delete/filename.txt");
		if(newobj.delete())
		{
			System.out.println("Delete the file: " + newobj.getName());
		}else {
			System.out.println("Failed to delete the file..");
		}

	}

}

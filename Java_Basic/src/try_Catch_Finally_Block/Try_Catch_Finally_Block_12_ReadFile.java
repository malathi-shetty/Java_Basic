package try_Catch_Finally_Block;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Try_Catch_Finally_Block_12_ReadFile {

	public static void main(String[] args) {
			        // Initialize variables
		        BufferedReader reader = null;
		        File file = null;

		      //The try block contains the code that might throw an IOException.
		        try {
		        	
		        	System.out.println("Current working directory: " + System.getProperty("user.dir"));
		        	
		         // Create a File object (provide a valid file path) with the specified path.
		         //   file = new File(System.getProperty("user.dir") + "/src/try_Catch_Finally_Block/Try_Catch.txt");
		        	
		        	// Give IO Exception with the incorrect File path
		        	   file = new File(System.getProperty("user.dir") );
		            System.out.println("File path: " + file.getAbsolutePath());
		            
		            // Create a BufferedReader object using a FileReader initialized with the File object.
		            reader = new BufferedReader(new FileReader(file));  
		           
		            // To read from the file using reader
		           String line;

		            // Read and print each line from the file
		            while ((line = reader.readLine()) != null) {
		                System.out.println(line);
		            }
          
		         // Check if file exists
		            if (!file.exists()) {
		                System.err.println("File does not exist at the specified path.");
		                return; // Exit if file does not exist
		            }
		           
		        } catch (IOException e) 
		        {            
		        	//The catch block handles IOException if it occurs. - Handle the IOException
		            System.err.println("An IOException was caught: " + e.getMessage());
		        } finally 
		        {
		        //The finally block ensures that the BufferedReader is closed properly to avoid resource leaks.
		           if (reader != null) {
		              try 
		              {
		                  reader.close();
		              } catch (IOException e) 
		              {
		           System.err.println("An IOException was caught while closing BufferedReader: " + e.getMessage());
		              }
		            }
		        }
		    }
	}
package conditional_statement;

public class Nested_If_else {

	public static void main(String[] args) {
		
		// Declaring double type variables		
		Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
		
		if(n1 >= n2)
		{
			//Checks if n1 is greater than or equal to n2
			
			if(n1 >= n3)
			{
				 // n1 is greater than or equal to both n2 and n3
				largest = n1;
			 } else {
	                // n1 is greater than or equal to n2 but less than n3
	                largest = n3;
	            }
		}else {
	                // n1 is less than n2
				
				if(n2 >= n3) {
					// n2 is greater than or equal to both n1 and n3
					largest = n2;
				}
					
			
			else {
				 // n2 is less than n3
				largest = n3;
			}
		}
		

		
		System.out.println("largest number: " + largest);
}
}
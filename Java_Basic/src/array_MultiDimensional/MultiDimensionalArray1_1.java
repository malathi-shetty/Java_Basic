package array_MultiDimensional;

public class MultiDimensionalArray1_1 {

	public static void main(String[] args) {

		String a[][] = { 
				{ "*" }, 
				{ "*", "*" }, 
				{ "*", "*", "*" } 
				};

		// Iterate through the 2D array_SingleDimensional and print each element
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); // Move to the next line after each row
		}

	}

}

/*
 * The outer loop iterates over each row. The inner loop iterates over each
 * column in the current row and prints the asterisk followed by a space.
 * 
 * System.out.print(a[i][j] + " "); prints each asterisk with a space in
 * between. System.out.println(); ensures that after printing all elements of a
 * row, the cursor moves to the next line, creating the desired row-by-row
 * output.
 * 
 */

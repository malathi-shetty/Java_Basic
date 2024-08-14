package spaces;

import java.util.Arrays;

public class Splitting_text {

	public static void main(String[] args) {
		String text = "hello    world";
		String[] words = text.split("\\s+"); // Splits on one or more spaces
		System.out.println(Arrays.toString(words)); // Output: [hello, world]

		/*
		 * Pattern: \s+ 
		 * Usage: To split a string on one or more whitespace characters.
		 */

	}

}

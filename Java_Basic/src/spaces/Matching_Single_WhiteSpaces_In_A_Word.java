package spaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matching_Single_WhiteSpaces_In_A_Word {

	public static void main(String[] args) {
		String str = " This is a Sample Sentence for Example. ";

		Matcher matcher = Pattern.compile("\\s").matcher(str);
		while (matcher.find()) {
			System.out.println("Found whitespace at index: " + matcher.start());
		}

		/*
		 * Pattern: \s Usage: To match and process individual whitespace characters.

		 * Use \s to match a single whitespace character. Use \s+ to match one or more
		 * consecutive whitespace characters, which is useful for scenarios where
		 * whitespace may vary in length or quantity.
		 */
	}
}
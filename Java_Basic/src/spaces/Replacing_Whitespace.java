package spaces;

public class Replacing_Whitespace {

	public static void main(String[] args) {
		String text = "hello    world";
		String result = text.replaceAll("\\s+", " "); // Replaces multiple spaces with a single space
		System.out.println(result); // Output: "hello world"

		/*
		 * Pattern: \s+ Usage: To replace multiple whitespace characters with a single
		 * space.
		 */
	}
}
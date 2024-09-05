package stringBuilder;

public class StringBuilder_concept2 {

	public static void main(String[] args) {
		// Initialize both StringBuilder objects
		StringBuilder s = new StringBuilder("Basic ");
		StringBuilder s1 = new StringBuilder("Java ");

		// Append "Concept " to s
		s.append("Concept ");
		System.out.println("s: " + s); // Should print: Basic Concept

		// Update s1 to match the content of s
		s1.replace(0, s1.length(), "Basic Concept ");
		System.out.println("s1: " + s1); // Should print: Basic Concept

		// Compare the objects using '=='
		System.out.print("s==s1: ");
		System.out.print(s == s1); // Should print: false (because they are different objects)

		System.out.println(" ");

		// Compare the contents using 'toString().equals()'
		System.out.println("s Equals s1: " + s.toString().equals(s1.toString())); // Should print: true
	}

}

/*
 * 
 * Using replace Method:
 * 
 * The replace method in StringBuilder can replace a portion of the sequence
 * with a new string. This method takes three arguments: the start index, the
 * end index, and the replacement string.
 * 
 * s1.replace(0, s1.length(), "Basic Concept "); replaces the entire content of
 * s1 with "Basic Concept ". Print Statements:
 * 
 * System.out.println("s: " + s); will print "Basic Concept " as expected.
 * 
 * System.out.println("s1: " + s1); will also print "Basic Concept " after
 * replacing its content. Comparison:
 * 
 * s == s1 will still be false because s and s1 are different instances of
 * StringBuilder.
 * 
 * s.toString().equals(s1.toString()) will now be true since both StringBuilder
 * instances have the same content.
 * 
 * 
 * 
 * 
 * 
 */
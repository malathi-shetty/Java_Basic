package string_Methods_In_Java;

public class Index_Of {

	public static void main(String[] args) {
		
		//the indexOf method in Java returns the index within the string of the first occurrence of the specified character. 
		//If the character is not found, it returns -1.
		
		String s1="Hello World";
		System.out.println(" Index of 'H': " + s1.indexOf('H'));//'H' is the character we are searching for in the string "Hello World". - The output is 0 because 'H' is found at index 0 in the string.
		System.out.println(" Index of 'e': " + s1.indexOf('e'));//The output is 1 because 'e' is found at index 1 in the string.
		System.out.println(" Index of 'l': " + s1.indexOf('l')); //The output is 2 because the first occurrence of 'l' is found at index 2 in the string.
		System.out.println(" Index of 'l': " + s1.indexOf('l'));//second occurrence of searching for 'l'. - The output is again 2 because indexOf returns the index of the first occurrence of the character in the string, and it starts searching from the beginning.
		System.out.println(" Index of 'o': " + s1.indexOf('o'));//The output is 4 because 'o' is found at index 4 in the string.
		System.out.println(" Index of '': " + s1.indexOf(' '));//The output is 5 because the space is found at index 5 in the string.
		System.out.println(" Index of 'W': " + s1.indexOf('W'));//The output is 6 because 'W' is found at index 6 in the string.
		System.out.println(" Index of 'o': " + s1.indexOf('o'));// second occurrence of searching for 'o'. - The output is 4 again, as indexOf still returns the index of the first occurrence.
		System.out.println(" Index of 'r': " + s1.indexOf('r')); //The output is 8 because 'r' is found at index 8 in the string.
		System.out.println(" Index of 'l': " + s1.indexOf('l')); // third occurrence of searching for 'l'. - The output is 2 again, as indexOf returns the index of the first occurrence.
		System.out.println(" Index of 'd': " + s1.indexOf('d'));//The output is 10 because 'd' is found at index 10 in the string.
		
		// when using indexOf with characters that are not present in the string, you will consistently get -1 as the result, indicating that the character was not found.
		// if you modify one of the indexOf calls to search for a character that does not exist in the string "Hello World", you would get -1 as the output:
		System.out.println(" Index of 'N': " + s1.indexOf('N')); //'N' does not exist in the string "Hello World", so indexOf('N') returns -1.
		System.out.println(" Index of 'i': " + s1.indexOf('i')); //'i' is not found in "Hello World", so the output is -1
		System.out.println(" Index of 'c': " + s1.indexOf('c'));
		System.out.println(" Index of 'e': " + s1.indexOf('e'));
		
		//This behavior is consistent across all versions of Java where the indexOf method is available. It's a handy way to check the presence and position of characters within strings.
		// If the character you are searching for is not found within the string, the indexOf method in Java returns -1. This is useful because it allows you to check if a specific character exists in a string and also determine its position if it does exist.
	}

}

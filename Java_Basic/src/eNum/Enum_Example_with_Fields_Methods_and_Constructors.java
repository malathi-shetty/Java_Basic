package eNum;

public class Enum_Example_with_Fields_Methods_and_Constructors {

	// Define the Season enum with additional fields, a constructor, and methods
	public enum Season {
		Winter("Cold", -1), SPRING("Mild", 15), SUMMER("Hot", 30), Fall("Cool", 10);

		private final String description;
		private final int averageTempature;

		// Constructor for the enum - is used to initialize the fields when an enum
		// constant is created.
		Season(String description, int averageTempature) {
			this.description = description;
			this.averageTempature = averageTempature;

		}

		// Getter for description - getter methods that provide access to the enum’s
		// fields.
		public String getDescription() {
			return description;

		}

		public int getaverageTemperature() {
			return averageTempature;

		}

	}

	public static void main(String[] args) {

		// Iterate over and print the values of Season enum with additional information
		System.out.println("Seasons and their details: ");
		for (Season s : Season.values()) {
			// Print formatted details of each season
			System.out.printf("Season: %s%nDescription: %s%nAverage Temperature: %d°C%n%n", s, s.getDescription(),
					s.getaverageTemperature());
		}

	}

}

/*
 * System.out.printf is powerful for producing formatted output, especially when
 * dealing with tabular data, currency, or numbers requiring specific
 * formatting.
 * 
 * 
 * System.out.
 * printf("Season: %s%nDescription: %s%nAverage Temperature: %d°C%n%n", s,
 * s.getDescription(), s.getAverageTemperature());
 * 
 * 
 * Format String "Season: %s%nDescription: %s%nAverage Temperature: %d°C%n%n"
 * 
 * This is the format string that specifies how the output should be formatted.
 * It contains format specifiers and literal text.
 * 
 * %s: A format specifier for a String. It is used to print the Season enum
 * constant and its description.
 * 
 * %d: A format specifier for an int. It is used to print the average
 * temperature.
 * 
 * %n: A platform-independent newline character. It ensures the output moves to
 * the next line in a way that's consistent with the operating system.
 * 
 * °C: Literal text that will appear as is, representing the degree Celsius
 * symbol.
 * 
 * Arguments s: The Season enum constant (e.g., WINTER, SPRING, etc.). When %s
 * is encountered in the format string, this Season value is converted to its
 * toString representation (e.g., WINTER).
 * 
 * s.getDescription(): This method call retrieves the description associated
 * with the Season enum constant (e.g., "Cold" for WINTER).
 * 
 * s.getAverageTemperature(): This method call retrieves the average temperature
 * associated with the Season enum constant (e.g., -1 for WINTER).
 * 
 */

package conditional_statement;

public class Do_While_loop {

	public static void main(String[] args) {
		int i = 20;
		do {
			System.out.println(i);

			i = i + 1; // Increment i inside the loop
		}

		while (i < 30);// Update the condition to make the loop meaningful

	}

}

/*
 * The do-while loop executes the block of code once before checking the condition. 
 * It then continues to execute the block as long as the condition is true. 
 * This guarantees that the code inside the loop executes at least once, regardless of the condition.
 * 
 * The loop prints numbers from 20 to 29 because i starts at 20, and it increments by 1 each time
 *  until it reaches 30, at which point the loop terminates.
 */
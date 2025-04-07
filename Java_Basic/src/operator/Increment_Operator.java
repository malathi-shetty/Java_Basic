package operator;

public class Increment_Operator {

	public static void main(String[] args) {
		int a = 5;
        int b = 10;
        
        // Post-increment
        int result1 = a++;  // First, assign a to result1, then increment a
        System.out.println("Post-increment: result1 = " + result1 + ", a = " + a);
        
        // Pre-increment
        int result2 = ++b;  // First, increment b, then assign b to result2
        System.out.println("Pre-increment: result2 = " + result2 + ", b = " + b);

	}

}


/*

The ++ operator in Java is the increment operator, which increases the value of a variable by 1. There are two types of increment operators:

Post-increment (x++): The value of x is returned first, then it is incremented.

Pre-increment (++x): The value of x is incremented first, then it is returned.


In the post-increment (a++), the value of a is used in the expression first and then incremented.

In the pre-increment (++b), b is incremented first, and the incremented value is used.

Post-increment: result1 = 5, a = 6

Pre-increment: result2 = 11, b = 11


*/
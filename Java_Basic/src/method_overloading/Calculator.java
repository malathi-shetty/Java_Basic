package method_overloading;

public class Calculator {

	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    
	public static void main(String[] args) {
		Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
    }

}


/*

Method Overloading
Definition: Method overloading occurs when multiple methods in the same class have the same name but differ in the number, type, or order of their parameters. This allows a class to perform similar operations with different types or numbers of inputs.

The Calculator class has multiple add methods with the same name but different parameter lists.​

This allows adding either two integers, three integers, or two doubles.​

The appropriate method is invoked based on the arguments passed during the method call.​

Key Points:

Method overloading is determined at compile time (compile-time polymorphism).​
GeeksforGeeks

It enhances code readability and allows performing similar operations with different data types or numbers of inputs.​

Overloaded methods must differ in parameter type, number, or both; they cannot differ solely by return type.



Output:

Sum of 2 and 3: 5

Sum of 1, 2, and 3: 6

Sum of 2.5 and 3.5: 6.0

*/
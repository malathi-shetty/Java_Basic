package learnBasic_OOPS_Only_Learning_How_It_works;

public class Polymorphism_Compile_Time_7 {

	static class Calculator {
		static int add(int a, int b) {
			return a + b;
		}

		static double add(double a, double b) {
			return a + b;
		}

		public static void main(String[] args) {
			System.out.println("Static Int: " + Calculator.add(123, 17));
			System.out.println("Static double: "  + Calculator.add(18.3, 1.9));
		}
	}
}
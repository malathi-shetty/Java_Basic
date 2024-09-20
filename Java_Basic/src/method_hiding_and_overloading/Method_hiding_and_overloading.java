package method_hiding_and_overloading;

public class Method_hiding_and_overloading {
	
	// Static method with no parameters
    static void m1() {
        System.out.println("Static method m1 with no parameters");
    }
    
    // Static method with two parameters
    static void m1(int a, int b) {
        System.out.println("Static method m1 with parameters: " + a + " and " + b);
    }
    
    // Instance method with no parameters
    int m2() {
        return 42; // Example return value
    }
    
    public static void main(String[] args) {
        // Calling static methods using the class name
        Method_hiding_and_overloading.m1();        // Output: Static method m1 with no parameters
        Method_hiding_and_overloading.m1(5, 10);   // Output: Static method m1 with parameters: 5 and 10
        
        // Creating an instance of Method_hiding_and_overloading to call the instance method
        Method_hiding_and_overloading obj = new Method_hiding_and_overloading();
        int result = obj.m2();
        System.out.println("Instance method m2 returns: " + result); // Output: Instance method m2 returns: 42
    }
	    
	    
	
}
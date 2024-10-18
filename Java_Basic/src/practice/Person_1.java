package practice;

public class Person_1 {
	
	// simplest approach if you want to keep args as a class-level variable:

	 static String[] args = {"1", "2"};

	    public static void main(String[] args) {
	        System.out.println("Command-line args length: " + args.length);
	        System.out.println("Class-level args length: " + Person_1.args.length);

}
}
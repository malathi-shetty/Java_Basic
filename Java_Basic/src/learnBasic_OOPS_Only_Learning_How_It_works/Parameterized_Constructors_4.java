package learnBasic_OOPS_Only_Learning_How_It_works;

import junit.framework.Test;

public class Parameterized_Constructors_4 {

	public static void main(String[] args) {
        // Create objects using the parameterized constructor
        Parameterized_Constructors_4_1 obj1 = new Parameterized_Constructors_4_1(11001, "Facebook");
        Parameterized_Constructors_4_1 obj2 = new Parameterized_Constructors_4_1(23003, 12345, "Instagram");

        // Call the info method to display details
        obj1.info();
        obj2.info();
    }

}
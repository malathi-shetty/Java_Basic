package eNum;

public class Enum {
    public enum Season { Winter, Spring, Fall, Summer }

    public enum DaysOfTheWeek { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday }

    public enum MonthsOfTheYear { January, February, March, April, May, June, July, August, September, October, November, December }

    public static void main(String[] args) {
        // Iterate over and print the values of Season enum
        System.out.println("Seasons:");
        for (Season s : Season.values()) {
            System.out.println(s);
        }

        // Iterate over and print the values of DaysOfTheWeek enum
        System.out.println("\nDays of the Week:");
        for (DaysOfTheWeek d : DaysOfTheWeek.values()) {
            System.out.println(d);
        }

        // Iterate over and print the values of MonthsOfTheYear enum
        System.out.println("\nMonths of the Year:");
        for (MonthsOfTheYear m : MonthsOfTheYear.values()) {
            System.out.println(m);
        }
    }
}


/*
 * Enum Characteristics:
 - enum names typically start with an uppercase letter 
 enums in Java are used for fixed sets of constants and are implicitly static and final.
 use enums to represent a fixed set of related constants such as days of the week, months of the year, seasons, etc
 Enums can also have fields, methods, and constructors if needed.
*/
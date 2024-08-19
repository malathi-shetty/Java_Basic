package learnBasic_OOPS_Only_Learning_How_It_works;

public class Car_Class {
	private String color;
	private String model;
	private int year;

// Constructor
	public Car_Class(String color, String model, int year) {
		this.color = color;
		this.model = model;
		this.year = year;
	}

// Method to display car details
	public void displayDetails() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}

// Getter for color
	public String getColor() {
		return color;
	}

// Setter for color
	public void setColor(String color) {
		this.color = color;
	}

}

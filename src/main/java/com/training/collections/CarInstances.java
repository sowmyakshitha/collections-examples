package com.training.collections;

/**
 * This Class has attributes of car like make,model,year,price It Implements
 * Comparable Interface to compare the values
 * 
 * @author ksowmya
 *
 */
public class CarInstances implements Comparable<CarInstances> {

	String make;
	String model;
	String year;
	double price;

	// Default Constructor
	public CarInstances() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public CarInstances(String make, String model, String year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * Setter and Getter methods
	 * 
	 * @return
	 */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(CarInstances car2) {
		// TODO Auto-generated method stub
		int result = this.make.compareTo(car2.make);
		if (result == 0)
		return Double.compare(this.price, car2.price);
		return Double.compare(this.price, car2.price);
		}

	@Override
	public String toString() {
		return "CarInstances [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	

}

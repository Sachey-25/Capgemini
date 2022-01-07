package org.springcore.lifecycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setting Property..!");
		this.price = price;
	}
	public Samosa() {
		super();
	}
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void hey() {
		System.out.println("Inside init method : Hey.. How are you doing?");
	}
	public void destroy() {
		System.out.println("Inside destroy method: Bye bye..! Guys get connected to alumni meeting.");
	}
}
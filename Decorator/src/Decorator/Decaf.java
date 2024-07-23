package Decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Coffee Decaf";
	}
	
	@Override
	public double cost() {
		return 1.24;
	}

}

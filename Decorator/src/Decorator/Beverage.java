package Decorator;

public abstract class Beverage {
	protected String description;
	
	public Beverage() {}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

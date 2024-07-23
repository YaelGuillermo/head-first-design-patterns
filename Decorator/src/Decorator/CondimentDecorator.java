package Decorator;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	
	public CondimentDecorator() {}
	
	public abstract String getDescription();
}

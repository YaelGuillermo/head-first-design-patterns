package Decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Coffe Dark Roast";
	}
	
	@Override
	public double cost() {
		return 1.50;
	}

}

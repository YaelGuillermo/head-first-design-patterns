package Decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Coffe Expresso";
	}
	
	@Override
	public double cost() {
		return 1.67;
	}

}

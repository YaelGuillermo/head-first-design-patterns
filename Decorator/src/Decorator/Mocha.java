package Decorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .56;
	}

}

package Decorator;

public class CoffeeShop {
	public void calculateBill(Beverage beverage) {
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}

package AbstractFactory;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new VeryThinCrustDough();
	}
	
	public Sauce createSauce() {
		return new BruschettaSauce();
	}
	
	public Cheese createCheese() {
		return new GoatCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Spinach(), new Onion() };
		return veggies;
	}
		
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new FreshClams();
	}
}

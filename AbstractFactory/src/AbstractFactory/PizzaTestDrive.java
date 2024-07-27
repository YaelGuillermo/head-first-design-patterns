package AbstractFactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		Pizza pizza = null;
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
 
		pizza = nyStore.orderPizza("cheese");
		System.out.println(pizza + "ordered by Ethan\n");
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println(pizza + "ordered by Josh\n");
		
		pizza = californiaStore.orderPizza("clam");
		System.out.println(pizza + "ordered by Drake\n");
		
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println(pizza + "ordered by me\n");
	}
}

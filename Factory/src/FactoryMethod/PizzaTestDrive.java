package FactoryMethod;

public class PizzaTestDrive {
	public static void main(String[] args) {
		Pizza pizza;
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		pizza = nyStore.orderPizza("clam");
		System.out.println("Drake ordered a " + pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Mary ordered a " + pizza.getName() + "\n");
		System.out.println("\nGONZÁLEZ HERŃANDEZ YAEL GUILLERMO\nPATRONES DE DISEÑO DE SOFTWARE");
	}
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE
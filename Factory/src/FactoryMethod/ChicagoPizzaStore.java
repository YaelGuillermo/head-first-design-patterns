package FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
		return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
		return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
		return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
		return new ChicagoStylePepperoniPizza();
		} else return null;
	}
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE
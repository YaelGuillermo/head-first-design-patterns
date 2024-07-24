package FactoryMethod;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
	
	void cut() {
        System.out.println("Cutting the pizza into triangular slices");
    }
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE
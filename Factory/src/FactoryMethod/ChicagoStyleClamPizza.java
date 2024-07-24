package FactoryMethod;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Fresh Clams");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
    void bake() {
		System.out.println("Bake for 30 minutes at 330");
	}
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE
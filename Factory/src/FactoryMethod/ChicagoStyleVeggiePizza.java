package FactoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Bell Peppers");
        toppings.add("Onions");
        toppings.add("Mushrooms");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE
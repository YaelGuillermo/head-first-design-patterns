package FactoryMethod;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Bell Peppers");
        toppings.add("Onions");
        toppings.add("Mushrooms");
    }

    void cut() {
        System.out.println("Cutting the pizza into triangular slices");
    }
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE